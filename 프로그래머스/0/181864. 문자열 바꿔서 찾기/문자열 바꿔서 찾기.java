public class Solution {
    public int solution(String myString, String pat) {
        // "A"를 "X"로, "B"를 "Y"로 변환한 문자열을 만듦
        StringBuilder convertedString = new StringBuilder();
        for (char ch : myString.toCharArray()) {
            if (ch == 'A') {
                convertedString.append('B');
            } else if (ch == 'B') {
                convertedString.append('A');
            }
        }
        
        // 변환된 문자열에서 pat이 있는지 확인
        return convertedString.toString().contains(pat) ? 1 : 0;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String myString1 = "ABBAA";
        String pat1 = "AABB";
        System.out.println(solution.solution(myString1, pat1)); // 1
        
        String myString2 = "ABAB";
        String pat2 = "ABAB";
        System.out.println(solution.solution(myString2, pat2)); // 0
    }
}
