import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();

        int p = -1;
        
        for (int num : arr) {
            if (num != p) {
                result.add(num);
                p = num;
            }
        }
        int[] a = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            a[i] = result.get(i);
        }
        
        return a;
    }
}
