import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> storage = new HashMap<>();
        
        for (String p : participant) {
            storage.put(p, storage.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            storage.put(c, storage.get(c) - 1);
        }
        
        for (String key : storage.keySet()) {
            if (storage.get(key) == 1) {
                return key;
            }
        }
        
        return "";
    }
}
