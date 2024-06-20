class Solution {
    public int solution(int age) {
        int currentYear = 2022;
        int birthYear = currentYear - age + 1;
        return birthYear;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
    }
}