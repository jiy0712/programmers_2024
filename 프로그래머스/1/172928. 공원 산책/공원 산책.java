class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();
        int[] p = new int[2];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    p[0] = i;
                    p[1] = j;
                    break;
                }
            }
        }

        for (String r : routes) {
            char d = r.charAt(0);
            int dd = Character.getNumericValue(r.charAt(2));
            int newY = p[0];
            int newX = p[1];

            for (int step = 1; step <= dd; step++) {
                switch (d) {
                    case 'N':
                        newY--;
                        break;
                    case 'S':
                        newY++;
                        break;
                    case 'W':
                        newX--;
                        break;
                    case 'E':
                        newX++;
                        break;
                }

                if (newY < 0 || newY >= h || newX < 0 || newX >= w || park[newY].charAt(newX) == 'X') {
                    newY = p[0];
                    newX = p[1];
                    break;
                }
            }

            p[0] = newY;
            p[1] = newX;
        }

        return p;
    }
}
