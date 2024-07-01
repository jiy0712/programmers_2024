public class Solution {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] num_list1 = {12, 4, 15, 46, 38, -2, 15};
        System.out.println(sol.solution(num_list1)); // 5
        
        int[] num_list2 = {13, 22, 53, 24, 15, 6};
        System.out.println(sol.solution(num_list2)); // -1
    }
}
