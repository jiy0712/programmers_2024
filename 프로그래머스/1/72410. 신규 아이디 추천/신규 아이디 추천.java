class Solution {
    public String solution(String id) {
        String pro = id.toLowerCase();
        pro = pro.replaceAll("[^a-z0-9-_.]", "");
        pro = pro.replaceAll("[.]{2,}", ".");
        pro = pro.replaceAll("^[.]|[.]$", "");
        
        if (pro.isEmpty()) {
            pro = "a";
        }
        
        if (pro.length() >= 16) {
            pro = pro.substring(0, 15);
            pro = pro.replaceAll("[.]$", "");
        }
        
        while (pro.length() < 3) {
            pro += pro.charAt(pro.length() - 1);
        }
        
        return pro;
    }
}
