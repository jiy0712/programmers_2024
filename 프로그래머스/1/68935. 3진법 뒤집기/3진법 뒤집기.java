class Solution {
    public int solution(int n) {
        StringBuilder ternary = new StringBuilder();
        
        while (n > 0) {
            ternary.append(n % 3);
            n /= 3;
        }
        
        String reversedTernary = ternary.toString();
        int answer = Integer.parseInt(reversedTernary, 3);
        
        return answer;
    }
}
