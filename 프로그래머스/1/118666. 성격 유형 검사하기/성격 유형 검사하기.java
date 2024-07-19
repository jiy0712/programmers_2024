import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<String, Integer> s = new HashMap<>();
        s.put("R", 0); s.put("T", 0);
        s.put("C", 0); s.put("F", 0);
        s.put("J", 0); s.put("M", 0);
        s.put("A", 0); s.put("N", 0);

        int[] point = {3, 2, 1, 0, 1, 2, 3};

        for (int i = 0; i < survey.length; i++) {
            String p = survey[i];
            int c = choices[i];

            String t1 = p.substring(0, 1);
            String t2 = p.substring(1, 2);

            if (c != 4) {
                int score = point[c - 1];
                if (c < 4) {
                    s.put(t1, s.get(t1) + score);
                } else {
                    s.put(t2, s.get(t2) + score);
                }
            }
        }

        StringBuilder result = new StringBuilder();

        String[] types = {"R", "C", "J", "A"};
        for (String type : types) {
            String t1 = type;
            String t2 = getOppositeType(type);
            
            if (s.get(t1) > s.get(t2)) {
                result.append(t1);
            } else if (s.get(t1) < s.get(t2)) {
                result.append(t2);
            } else {
                result.append(t1.compareTo(t2) < 0 ? t1 : t2);
            }
        }

        return result.toString();
    }

    private String getOppositeType(String type) {
        switch (type) {
            case "R": return "T";
            case "C": return "F";
            case "J": return "M";
            case "A": return "N";
            default: return "";
        }
    }
}
