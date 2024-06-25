public class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddNumbers = new StringBuilder();
        StringBuilder evenNumbers = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenNumbers.append(num);
            } else {
                oddNumbers.append(num);
            }
        }

        int oddSum = Integer.parseInt(oddNumbers.toString());
        int evenSum = Integer.parseInt(evenNumbers.toString());

        return oddSum + evenSum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        
    }
}
