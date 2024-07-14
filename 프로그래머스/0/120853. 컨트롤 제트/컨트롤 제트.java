class Solution {
    public int solution(String s) {
        String[] parts = s.split(" ");
        int sum = 0;
        int lastNumber = 0;

        for (String part : parts) {
            if (part.equals("Z")) {
                sum -= lastNumber;
            } else {
                lastNumber = Integer.parseInt(part);
                sum += lastNumber;
            }
        }

        return sum;
    }
}
