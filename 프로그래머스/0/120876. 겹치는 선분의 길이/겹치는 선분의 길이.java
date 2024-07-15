class Solution {
    public int solution(int[][] lines) {
        int[] lineCoverage = new int[201]; // 범위 -100 to 100

        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;
            for (int i = start; i < end; i++) {
                lineCoverage[i]++;
            }
        }

        int overlapLength = 0;
        for (int count : lineCoverage) {
            if (count > 1) {
                overlapLength++;
            }
        }

        return overlapLength;
    }
}
