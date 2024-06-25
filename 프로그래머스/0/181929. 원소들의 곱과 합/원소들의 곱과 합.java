public class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0;

        for (int num : num_list) {
            product *= num;
            sum += num;
        }

        int sumSquared = sum * sum;

        return product < sumSquared ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        
    }
}
