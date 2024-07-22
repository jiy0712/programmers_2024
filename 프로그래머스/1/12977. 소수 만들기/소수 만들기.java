import java.util.*;

public class Solution {
    public int solution(int[] numm) {
        int count = 0;
        int n = numm.length;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (isPrime(numm[i] + numm[j] + numm[k])) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{1, 2, 3, 4})); // Output: 1
        System.out.println(sol.solution(new int[]{1, 2, 7, 6, 4})); // Output: 4
    }
}
