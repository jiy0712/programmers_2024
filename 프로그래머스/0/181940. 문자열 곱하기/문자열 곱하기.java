public class Solution {
    public String solution(String my_string, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(my_string);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        
    }
}
