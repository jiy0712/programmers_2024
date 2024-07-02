public class Solution {
    public String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("jaron")); // "noraj"
        System.out.println(sol.solution("bread")); // "daerb"
    }
}
