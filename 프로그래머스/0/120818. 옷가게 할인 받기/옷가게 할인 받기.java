class Solution {
    public int solution(int price) {
        int discountedPrice = price;
        
        if (price >= 500000) {
            discountedPrice = (int) (price * 0.8);
        } else if (price >= 300000) {
            discountedPrice = (int) (price * 0.9);
        } else if (price >= 100000) {
            discountedPrice = (int) (price * 0.95);
        }
        
        return discountedPrice;
    }
}

