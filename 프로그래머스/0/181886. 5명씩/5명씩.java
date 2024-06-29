import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> solution(String[] names) {
        List<String> result = new ArrayList<>();
        
        int numOfGroups = (int) Math.ceil((double) names.length / 5);
        
        for (int i = 0; i < numOfGroups; i++) {
            result.add(names[i * 5]);
        }
        
        return result;
    }
}
