class Solution {
    public int solution(int chicken) {
        int serviceChicken = 0;
        int coupons = chicken;

        while (coupons >= 10) {
            int newChicken = coupons / 10;
            serviceChicken += newChicken;
            coupons = newChicken + (coupons % 10);
        }

        return serviceChicken;
    }
}
