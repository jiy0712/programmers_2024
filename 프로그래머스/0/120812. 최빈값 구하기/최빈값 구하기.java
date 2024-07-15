import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFrequency = 0;
        int mode = -1;
        boolean isDuplicate = false;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
                isDuplicate = false;
            } else if (entry.getValue() == maxFrequency) {
                isDuplicate = true;
            }
        }
        
        return isDuplicate ? -1 : mode;
    }
}
