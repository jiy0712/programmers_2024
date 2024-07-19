import java.util.Stack;

class Solution {
    public int solution(int[] ii) {
        int count = 0;
        Stack<Integer> s = new Stack<>();

        for (int i : ii) {
            s.push(i);

            if (s.size() >= 4) {
                if (s.get(s.size() - 4) == 1 &&
                    s.get(s.size() - 3) == 2 &&
                    s.get(s.size() - 2) == 3 &&
                    s.get(s.size() - 1) == 1) {
                    
                    s.pop();
                    s.pop();
                    s.pop();
                    s.pop();
                    
                    count++;
                }
            }
        }

        return count;
    }
}
