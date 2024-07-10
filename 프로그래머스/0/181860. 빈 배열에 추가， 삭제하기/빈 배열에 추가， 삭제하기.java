import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> X = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                int value = arr[i];
                for (int j = 0; j < value * 2; j++) {
                    X.add(value);
                }
            } else {
                int value = arr[i];
                for (int j = 0; j < value; j++) {
                    if (!X.isEmpty()) {
                        X.remove(X.size() - 1);
                    }
                }
            }
        }
        
        // ArrayList를 int 배열로 변환하여 반환
        int[] answer = new int[X.size()];
        for (int i = 0; i < X.size(); i++) {
            answer[i] = X.get(i);
        }
        
        return answer;
    }
}
