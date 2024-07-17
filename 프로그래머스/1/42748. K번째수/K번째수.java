import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] c) {
        int[] result = new int[c.length];
        
        for (int idx = 0; idx < c.length; idx++) {
            int[] cc = c[idx];
            int i = cc[0];
            int j = cc[1];
            int a = cc[2];
            
            int[] temp = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(temp);
            
            result[idx] = temp[a - 1];
        }
        
        return result;
    }
}
