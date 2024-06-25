import java.util.List;
import java.util.ArrayList;

public class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder result = new StringBuilder();
        
        for (String str : str_list) {
            if (!str.contains(ex)) {
                result.append(str);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        
    }
}
