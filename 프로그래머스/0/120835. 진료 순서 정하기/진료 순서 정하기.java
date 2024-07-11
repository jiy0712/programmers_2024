import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortedEmergency = emergency.clone();
        Arrays.sort(sortedEmergency);
        
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sortedEmergency.length; i++) {
            rankMap.put(sortedEmergency[i], sortedEmergency.length - i);
        }
        
        int[] result = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            result[i] = rankMap.get(emergency[i]);
        }
        
        return result;
    }
}
