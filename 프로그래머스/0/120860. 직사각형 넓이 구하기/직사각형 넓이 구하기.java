class Solution {
    public int solution(int[][] dots) {
        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        
        for (int[] dot : dots) {
            int x = dot[0];
            int y = dot[1];
            
            if (x < xMin) xMin = x;
            if (x > xMax) xMax = x;
            if (y < yMin) yMin = y;
            if (y > yMax) yMax = y;
        }
        
        int width = xMax - xMin;
        int height = yMax - yMin;
        
        return width * height;
    }
}
