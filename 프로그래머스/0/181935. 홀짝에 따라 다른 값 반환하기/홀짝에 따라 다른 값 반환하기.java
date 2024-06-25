public class Solution {
    public int solution(int n) {
        if (n % 2 == 1) {
            // n이 홀수일 때
            int sum = 0;
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
            return sum;
        } else {
            // n이 짝수일 때
            int sum = 0;
            for (int i = 2; i <= n; i += 2) {
                sum += i * i;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        
    }
}
