import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] key, String[] tget) {
        Map<Character, Integer> storage = new HashMap<>();
        
        for (int i = 0; i < key.length; i++) {
            String a = key[i];
            for (int j = 0; j < a.length(); j++) {
                char b = a.charAt(j);
                storage.put(b, Math.min(storage.getOrDefault(b, j + 1), j + 1));
            }
        }
        
        int[] r = new int[tget.length];
        
        for (int i = 0; i < tget.length; i++) {
            String t = tget[i];
            int total = 0;
            boolean poss = true;
            
            for (int j = 0; j < t.length(); j++) {
                char b = t.charAt(j);
                if (!storage.containsKey(b)) {
                    poss = false;
                    break;
                } else {
                    total += storage.get(b);
                }
            }
            
            r[i] = poss ? total : -1;
        }
        
        return r;
    }
}
