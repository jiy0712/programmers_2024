import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                double avgA = (score[a][0] + score[a][1]) / 2.0;
                double avgB = (score[b][0] + score[b][1]) / 2.0;
                return Double.compare(avgB, avgA);
            }
        });

        int[] ranks = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || (score[indices[i]][0] + score[indices[i]][1]) / 2.0 != (score[indices[i-1]][0] + score[indices[i-1]][1]) / 2.0) {
                ranks[indices[i]] = i + 1;
            } else {
                ranks[indices[i]] = ranks[indices[i-1]];
            }
        }

        return ranks;
    }
}
