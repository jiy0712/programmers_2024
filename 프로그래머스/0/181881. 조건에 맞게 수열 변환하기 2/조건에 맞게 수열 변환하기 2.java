class Solution {
    public int solution(int[] arr) {
        int count = 0;
        boolean changed = true;

        while (changed) {
            changed = false;
            int[] newArr = arr.clone();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    newArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    newArr[i] = arr[i] * 2 + 1;
                } else {
                    newArr[i] = arr[i];
                }
                
                if (newArr[i] != arr[i]) {
                    changed = true;
                }
            }

            arr = newArr;
            count++;
        }

        return count - 1;
    }
}
