public class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String my_string1 = "bus";
        System.out.println(sol.solution(my_string1)); // "bs"
        
        String my_string2 = "nice to meet you";
        System.out.println(sol.solution(my_string2)); // "nc t mt y"
    }
}
