import java.util.HashSet;

class Solution {
    public int solution(int[] num) {
        HashSet<Integer> s = new HashSet<>();
        for (int n : num) {
            s.add(n);
        }
        
        int max = Math.min(s.size(), num.length / 2);
        
        return max;
    }
}
