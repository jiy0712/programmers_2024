import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        // 배열에서 가장 큰 두 값의 곱과 가장 작은 두 값의 곱 중 최댓값을 반환
        return Math.max(numbers[n - 1] * numbers[n - 2], numbers[0] * numbers[1]);
    }
}
