class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[256]; // ASCII 범위
        
        for (char c : my_string.toCharArray()) {
            if (!visited[c]) {
                sb.append(c);
                visited[c] = true;
            }
        }
        
        return sb.toString();
    }
}
