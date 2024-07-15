class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canBabble = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            for (String babble : canBabble) {
                word = word.replace(babble, " ");
            }
            if (word.trim().isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
