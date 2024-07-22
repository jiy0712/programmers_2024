public class Solution {
    public int solution(int num, int limit, int power) {
        int total = 0;

        for (int i = 1; i <= num; i++) {
            int divisorCount = countDivisors(i);

            if (divisorCount > limit) {
                total += power;
            } else {
                total += divisorCount;
            }
        }

        return total;
    }

    private int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(5, 3, 2)); 
        System.out.println(sol.solution(10, 3, 2)); 
    }
}
