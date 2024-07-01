public class Solution {
    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String my_string1 = "banana";
        String is_prefix1 = "ban";
        System.out.println(sol.solution(my_string1, is_prefix1)); // 1
        
        String my_string2 = "banana";
        String is_prefix2 = "nan";
        System.out.println(sol.solution(my_string2, is_prefix2)); // 0
        
        String my_string3 = "banana";
        String is_prefix3 = "abcd";
        System.out.println(sol.solution(my_string3, is_prefix3)); // 0
        
        String my_string4 = "banana";
        String is_prefix4 = "bananan";
        System.out.println(sol.solution(my_string4, is_prefix4)); // 0
    }
}
