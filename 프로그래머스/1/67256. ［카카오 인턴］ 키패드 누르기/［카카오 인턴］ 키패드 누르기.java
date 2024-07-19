class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder result = new StringBuilder();
        int l = 10;
        int r = 12;
        
        for (int num : numbers) {
            if (num == 0) {
                num = 11;
            }
            
            if (num % 3 == 1) {
                result.append("L");
                l = num;
            } else if (num % 3 == 0) {
                result.append("R");
                r = num;
            } else {
                int ll = getDistance(l, num);
                int rr = getDistance(r, num);
                
                if (ll < rr) {
                    result.append("L");
                    l = num;
                } else if (ll > rr) {
                    result.append("R");
                    r = num;
                } else {
                    if (hand.equals("left")) {
                        result.append("L");
                        l = num;
                    } else {
                        result.append("R");
                        r = num;
                    }
                }
            }
        }
        
        return result.toString();
    }
    
    private int getDistance(int start, int target) {
        int[] startPos = { (start - 1) / 3, (start - 1) % 3 };
        int[] targetPos = { (target - 1) / 3, (target - 1) % 3 };
        return Math.abs(startPos[0] - targetPos[0]) + Math.abs(startPos[1] - targetPos[1]);
    }
}
