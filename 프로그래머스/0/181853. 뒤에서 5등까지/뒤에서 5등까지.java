import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] num_list) {
        // 배열을 리스트로 변환
        List<Integer> list = new ArrayList<>();
        for (int num : num_list) {
            list.add(num);
        }
        
        // 리스트를 오름차순 정렬
        list.sort(null); // 기본적으로 오름차순 정렬
        
        // 앞에서부터 5개의 원소를 새로운 리스트에 담기
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            result.add(list.get(i));
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] num_list1 = {12, 4, 15, 46, 38, 1, 14};
        List<Integer> result1 = solution.solution(num_list1);
        System.out.println(result1); // [1, 4, 12, 14, 15]
    }
}
