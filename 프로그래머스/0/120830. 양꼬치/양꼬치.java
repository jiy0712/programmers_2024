public class Solution {
    public int solution(int n, int k) {
        int lambCost = 12000;
        int drinkCost = 2000;
        
        int freeDrinks = n / 10;
        int totalCost = (n * lambCost) + ((k - freeDrinks) * drinkCost);
        
        return totalCost;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(10, 3)); // 124000
        System.out.println(sol.solution(64, 6)); // 768000
    }
}
