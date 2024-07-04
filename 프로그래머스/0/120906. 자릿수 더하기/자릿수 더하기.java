public class Solution {
    public int solution(int n) {
        int sum = 0;
        
        // 주어진 숫자를 문자열로 변환합니다.
        String numStr = Integer.toString(n);
        
        // 각 자릿수를 더합니다.
        for (int i = 0; i < numStr.length(); i++) {
            sum += numStr.charAt(i) - '0';  // 문자를 숫자로 변환하여 더합니다.
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // 테스트 케이스
        int n = 1234;
        
        // 함수를 호출하여 결과를 출력합니다.
        int result = solution.solution(n);
        System.out.println(result);  // 10 출력
    }
}
