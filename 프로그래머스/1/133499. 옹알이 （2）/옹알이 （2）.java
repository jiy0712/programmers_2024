class Solution {
    public int solution(String[] babbling) {
        String[] canPronounce = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String word : babbling) {
            String prev = "";
            boolean valid = true;
            while (word.length() > 0 && valid) {
                boolean found = false;
                for (String pronounce : canPronounce) {
                    if (word.startsWith(pronounce) && !pronounce.equals(prev)) {
                        word = word.substring(pronounce.length());
                        prev = pronounce;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    valid = false;
                }
            }
            if (valid && word.length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
