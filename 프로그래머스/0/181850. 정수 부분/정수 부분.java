public class Solution {
    public int solution(double flo) {
        return (int)Math.floor(flo);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        double flo1 = 1.42;
        System.out.println(solution.solution(flo1)); // 1

        double flo2 = 69.32;
        System.out.println(solution.solution(flo2)); // 69
    }
}
