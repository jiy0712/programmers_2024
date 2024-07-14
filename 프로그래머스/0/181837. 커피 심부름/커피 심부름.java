class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (String drink : order) {
            if (drink.contains("cafelatte")) {
                answer += 5000;
            } else if (drink.contains("americano") || drink.equals("anything")) {
                answer += 4500;
            }
        }
        
        return answer;
    }
}
