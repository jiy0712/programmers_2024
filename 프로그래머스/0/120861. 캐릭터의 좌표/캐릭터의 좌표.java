import java.util.*;

class Solution {
    public static int[] solution(String[] keyinput, int[] board) {
        int width = board[0];
        int height = board[1];
        int x = 0, y = 0;
        
        for (String command : keyinput) {
            switch (command) {
                case "up":
                    y++;
                    break;
                case "down":
                    y--;
                    break;
                case "left":
                    x--;
                    break;
                case "right":
                    x++;
                    break;
            }
            
            // Boundary check
            if (Math.abs(x) > width / 2 || Math.abs(y) > height / 2) {
                // Undo the last move because it's out of bounds
                switch (command) {
                    case "up":
                        y--;
                        break;
                    case "down":
                        y++;
                        break;
                    case "left":
                        x++;
                        break;
                    case "right":
                        x--;
                        break;
                }
            }
        }
        
        return new int[]{x, y};
    }
    
    public static void main(String[] args) {
        String[] keyinput1 = {"left", "right", "up", "right", "right"};
        int[] board1 = {11, 11};
        int[] result1 = solution(keyinput1, board1);
        System.out.println(Arrays.toString(result1));  // Output: [2, 1]
        
        String[] keyinput2 = {"down", "down", "down", "down", "down"};
        int[] board2 = {7, 9};
        int[] result2 = solution(keyinput2, board2);
        System.out.println(Arrays.toString(result2));  // Output: [0, -4]
    }
}
