class Solution {
    public int solution(int balls, int share) {
        return (int) combinations(balls, share);
    }

    private long combinations(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        k = Math.min(k, n - k); 
        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}
