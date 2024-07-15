class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int maxSide = Math.max(a, b);
        int minSide = Math.min(a, b);
        
        int count1 = maxSide - (maxSide - minSide);
        int count2 = a + b - maxSide - 1;
        
        return count1 + count2;
    }
}
