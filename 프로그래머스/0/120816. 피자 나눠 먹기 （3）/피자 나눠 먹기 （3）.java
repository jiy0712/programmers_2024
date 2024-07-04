public class Solution {
    public int solution(int slice, int n) {
        // 최소 피자 판 수를 계산합니다.
        return (n + slice - 1) / slice;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // 테스트 케이스
        int slice1 = 7;
        int n1 = 10;
        int slice2 = 4;
        int n2 = 12;
        
        // 함수를 호출하여 결과를 출력합니다.
        int result1 = solution.solution(slice1, n1);
        int result2 = solution.solution(slice2, n2);
        
        System.out.println(result1);  // 2 출력
        System.out.println(result2);  // 3 출력
    }
}
