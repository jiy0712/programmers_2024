public class Solution {
    public int solution(int hp) {
        int general = hp / 5;
        hp %= 5;
        int soldier = hp / 3;
        hp %= 3;
        int worker = hp;
        
        return general + soldier + worker;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(23)); // 5
        System.out.println(sol.solution(24)); // 6
        System.out.println(sol.solution(999)); // 201
    }
}
