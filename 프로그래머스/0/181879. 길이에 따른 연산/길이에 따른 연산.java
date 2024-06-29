public class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int product = 1;
        
        for (int num : num_list) {
            sum += num;
            product *= num;
        }
        
        if (num_list.length >= 11) {
            return sum;
        } else {
            return product;
        }
    }
}
