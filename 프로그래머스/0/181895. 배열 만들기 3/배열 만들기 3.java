import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            resultList.add(arr[i]);
        }
        
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            resultList.add(arr[i]);
        }
        
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
