class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if (n == 1) {
            return java.util.Arrays.copyOfRange(num_list, 0, b + 1);
        } else if (n == 2) {
            return java.util.Arrays.copyOfRange(num_list, a, num_list.length);
        } else if (n == 3) {
            return java.util.Arrays.copyOfRange(num_list, a, b + 1);
        } else if (n == 4) {
            int size = (b - a) / c + 1;
            int[] result = new int[size];
            int index = 0;
            for (int i = a; i <= b; i += c) {
                result[index++] = num_list[i];
            }
            return result;
        }
        return new int[0];
    }
}
