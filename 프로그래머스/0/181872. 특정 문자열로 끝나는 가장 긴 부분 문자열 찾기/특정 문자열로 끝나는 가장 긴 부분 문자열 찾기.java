class Solution {
    public String solution(String myString, String pat) {
        int n = myString.length();
        int m = pat.length();
        
        int startIndex = -1;
        for (int i = 0; i <= n - m; i++) {
            if (myString.substring(i, i + m).equals(pat)) {
                startIndex = i;
            }
        }
        
        if (startIndex != -1) {
            return myString.substring(0, startIndex + m);
        } else {
            return "";
        }
    }
}
