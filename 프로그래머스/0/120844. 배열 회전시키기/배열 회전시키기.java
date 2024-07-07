import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] rotated = new int[n];

        if (direction.equals("left")) {
            // 왼쪽으로 회전
            for (int i = 0; i < n - 1; i++) {
                rotated[i] = numbers[i + 1];
            }
            rotated[n - 1] = numbers[0];
        } else if (direction.equals("right")) {
            // 오른쪽으로 회전
            for (int i = 1; i < n; i++) {
                rotated[i] = numbers[i - 1];
            }
            rotated[0] = numbers[n - 1];
        }

        return rotated;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // 테스트 케이스 실행
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3}, "right"))); // [3, 1, 2]
        System.out.println(Arrays.toString(sol.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left"))); // [455, 6, 4, -1, 45, 6, 4]
    }
}
