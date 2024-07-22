import java.util.Arrays;

public class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int total = 0;
        int n = score.length;

        for (int i = n - m; i >= 0; i -= m) {
            total += score[i] * m;
        }

        return total;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1})); 
        System.out.println(sol.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}
