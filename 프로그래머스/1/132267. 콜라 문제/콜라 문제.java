class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int newBottles = (n / a) * b;
            int remainingBottles = n % a;
            n = newBottles + remainingBottles;
            answer += newBottles;
        }
        
        return answer;
    }
}
