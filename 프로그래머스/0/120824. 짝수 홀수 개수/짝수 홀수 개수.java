public class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[2]; // result[0]: 짝수 개수, result[1]: 홀수 개수
        for (int num : num_list) {
            if (num % 2 == 0) {
                result[0]++;
            } else {
                result[1]++;
            }
        }
        return result;
    }
}
