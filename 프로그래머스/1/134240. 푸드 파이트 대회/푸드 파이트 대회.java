class Solution {
    public String solution(int[] food) {
        StringBuilder leftSide = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int halfAmount = food[i] / 2;
            for (int j = 0; j < halfAmount; j++) {
                leftSide.append(i);
            }
        }
        
        String rightSide = leftSide.reverse().toString();
        leftSide.reverse().append("0").append(rightSide);
        
        return leftSide.toString();
    }
}
