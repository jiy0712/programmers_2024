import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> re = new HashMap<>();
        Map<String, Integer> recount = new HashMap<>();
        Map<String, Integer> mail = new HashMap<>();
        
        for (String id : id_list) {
            re.put(id, new HashSet<>());
            recount.put(id, 0);
            mail.put(id, 0);
        }
        
        for (String r : report) {
            String[] p = r.split(" ");
            String declared = p[0];
            String reported = p[1];
            if (re.get(declared).add(reported)) {
                recount.put(reported, recount.get(reported) + 1);
            }
        }
        
        for (String id : id_list) {
            if (recount.get(id) >= k) {
                for (String declared : id_list) {
                    if (re.get(declared).contains(id)) {
                        mail.put(declared, mail.get(declared) + 1);
                    }
                }
            }
        }
        
        int[] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            result[i] = mail.get(id_list[i]);
        }
        
        return result;
    }
}
