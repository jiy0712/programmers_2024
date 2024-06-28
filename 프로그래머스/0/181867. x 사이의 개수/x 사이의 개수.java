import java.util.Arrays;

public class Solution {
    public static int[] solution(String myString) {
        String[] splitStrings = myString.split("x", -1);
        int[] lengths = new int[splitStrings.length];

        for (int i = 0; i < splitStrings.length; i++) {
            lengths[i] = splitStrings[i].length();
        }

        return lengths;
    }

    public static void main(String[] args) {
        String myString1 = "oxooxoxxox";
        System.out.println(Arrays.toString(solution(myString1))); // [1, 2, 1, 0, 1, 0]

        String myString2 = "xabcxdefxghi";
        System.out.println(Arrays.toString(solution(myString2))); // [0, 3, 3, 3]
    }
}
