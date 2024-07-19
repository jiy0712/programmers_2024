import java.util.Stack;
class Solution {
    public int solution(int[][] bb, int[] m) {
        int count = 0;
        Stack<Integer> b = new Stack<>();
        for (int mm : m) {
            int c = mm - 1;
            for (int i = 0; i < bb.length; i++) {
                if (bb[i][c] != 0) {
                    int d = bb[i][c];
                    bb[i][c] = 0;
                    if (!b.isEmpty() && b.peek() == d) {
                        b.pop();
                        count += 2;
                    } else {
                        b.push(d);
                    }
                    break;
                }
            }
        }
        return count;
    }
}
