import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        Character[] chars = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        Arrays.sort(chars, Collections.reverseOrder());
        StringBuilder sortedStr = new StringBuilder(chars.length);
        for (Character c : chars) {
            sortedStr.append(c);
        }
        return Long.parseLong(sortedStr.toString());
    }
}
