import java.util.Arrays;

public class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] suffixes = new String[len];

        // 모든 접미사 생성
        for (int i = 0; i < len; i++) {
            suffixes[i] = my_string.substring(i);
        }

        // 접미사 배열 사전순으로 정렬
        Arrays.sort(suffixes);

        return suffixes;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // 테스트 케이스 실행
        System.out.println(Arrays.toString(sol.solution("banana"))); // ["a", "ana", "anana", "banana", "na", "nana"]
        System.out.println(Arrays.toString(sol.solution("programmers"))); // ["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]
    }
}
