class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int targetLength = 1;
        
        while (targetLength < length) {
            targetLength *= 2;
        }
        
        int[] result = new int[targetLength];
        for (int i = 0; i < length; i++) {
            result[i] = arr[i];
        }
        
        return result;
    }
}
