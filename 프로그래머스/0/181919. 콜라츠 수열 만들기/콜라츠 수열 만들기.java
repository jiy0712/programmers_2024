import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int n) {
        List<Integer> sequence = new ArrayList<>();
        while (n != 1) {
            sequence.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        sequence.add(1);
        return sequence;
    }
}
