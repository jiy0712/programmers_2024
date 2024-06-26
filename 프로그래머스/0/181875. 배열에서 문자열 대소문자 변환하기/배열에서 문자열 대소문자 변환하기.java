import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) { // 짝수 인덱스
                strArr[i] = strArr[i].toLowerCase();
            } else { // 홀수 인덱스
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] result1 = solution.solution(new String[]{"AAA", "BBB", "CCC", "DDD"});
        System.out.println(Arrays.toString(result1));

        String[] result2 = solution.solution(new String[]{"aBc", "AbC"});
        System.out.println(Arrays.toString(result2));
    }
}
