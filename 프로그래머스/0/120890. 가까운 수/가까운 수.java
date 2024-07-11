class Solution {
    public int solution(int[] array, int n) {
        int closest = array[0];
        int minDiff = Math.abs(array[0] - n);

        for (int num : array) {
            int diff = Math.abs(num - n);

            if (diff < minDiff || (diff == minDiff && num < closest)) {
                closest = num;
                minDiff = diff;
            }
        }

        return closest;
    }
}
