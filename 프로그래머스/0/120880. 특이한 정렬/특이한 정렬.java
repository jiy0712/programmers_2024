import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] numArray = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        Arrays.sort(numArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int distA = Math.abs(a - n);
                int distB = Math.abs(b - n);
                if (distA == distB) {
                    return b - a;
                }
                return distA - distB; 
            }
        });
        
        return Arrays.stream(numArray).mapToInt(Integer::intValue).toArray();
    }
}
