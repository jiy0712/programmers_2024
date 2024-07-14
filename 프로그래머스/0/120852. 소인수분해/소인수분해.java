import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> primeFactors = new HashSet<>();
        
        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }

    
        if (n > 2) {
            primeFactors.add(n);
        }

        ArrayList<Integer> sortedPrimeFactors = new ArrayList<>(primeFactors);
        sortedPrimeFactors.sort(Integer::compareTo);

        int[] answer = new int[sortedPrimeFactors.size()];
        for (int i = 0; i < sortedPrimeFactors.size(); i++) {
            answer[i] = sortedPrimeFactors.get(i);
        }

        return answer;
    }
}
