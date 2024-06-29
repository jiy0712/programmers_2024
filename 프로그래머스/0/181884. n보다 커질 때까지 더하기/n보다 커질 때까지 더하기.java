public class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        int i = 0;
        
        while (i < numbers.length && sum <= n) {
            sum += numbers[i];
            i++;
        }
        
        return sum;
    }
}
