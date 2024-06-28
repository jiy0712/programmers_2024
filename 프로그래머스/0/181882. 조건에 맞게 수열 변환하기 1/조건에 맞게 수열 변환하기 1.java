import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] arr) {
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                result[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                result[i] = arr[i] * 2;
            } else {
                result[i] = arr[i];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 100, 99, 98};
        System.out.println(Arrays.toString(solution(arr1))); // [2, 2, 6, 50, 99, 49]
        
        int[] arr2 = {50, 49, 51, 48, 47};
        System.out.println(Arrays.toString(solution(arr2))); // [25, 98, 51, 24, 94]
    }
}
