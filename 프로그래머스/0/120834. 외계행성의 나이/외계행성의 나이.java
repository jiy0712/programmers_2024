class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String ageStr = String.valueOf(age);
        
        for (char c : ageStr.toCharArray()) {
            answer.append((char) ('a' + (c - '0')));
        }
        
        return answer.toString();
    }
}
