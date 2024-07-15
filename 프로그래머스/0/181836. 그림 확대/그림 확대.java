class Solution {
    public String[] solution(String[] picture, int k) {
        int originalHeight = picture.length;
        int originalWidth = picture[0].length();
        int newHeight = originalHeight * k;
        int newWidth = originalWidth * k;
        
        String[] enlargedPicture = new String[newHeight];
        
        for (int i = 0; i < originalHeight; i++) {
            StringBuilder enlargedRow = new StringBuilder();
            for (char c : picture[i].toCharArray()) {
                for (int j = 0; j < k; j++) {
                    enlargedRow.append(c);
                }
            }
            String enlargedRowString = enlargedRow.toString();
            for (int l = 0; l < k; l++) {
                enlargedPicture[i * k + l] = enlargedRowString;
            }
        }
        
        return enlargedPicture;
    }
}
