import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> resultSet = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                resultSet.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            answer[index++] = num;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
