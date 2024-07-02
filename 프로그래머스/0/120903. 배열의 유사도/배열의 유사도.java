import java.util.HashSet;

public class Solution {
    public int solution(String[] s1, String[] s2) {
        HashSet<String> set1 = new HashSet<>();
        for (String str : s1) {
            set1.add(str);
        }
        
        int count = 0;
        for (String str : s2) {
            if (set1.contains(str)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"})); // 2
        System.out.println(sol.solution(new String[]{"n", "omg"}, new String[]{"m", "dot"})); // 0
    }
}
