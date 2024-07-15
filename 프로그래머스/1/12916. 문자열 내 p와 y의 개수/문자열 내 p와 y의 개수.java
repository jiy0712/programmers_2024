class Solution {
    boolean solution(String s) {
        int countP = 0;
        int countY = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'p') countP++;
            if (c == 'y') countY++;
        }
        
        return countP == countY;
    }
}
