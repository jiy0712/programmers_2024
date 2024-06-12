public class Solution {
    public static int[][] solution(int[] num_list, int n) {
        int length = num_list.length;
        int rows = length / n;
        int[][] result = new int[rows][n];
        
        for (int i = 0; i < length; i++) {
            result[i / n][i % n] = num_list[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        
        int[][] result = solution(num_list, n);
        for (int[] row : result) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}