class Solution {
    public static int minEatingSpeed(int[] piles, int h) {
        int answer = 0;
        int lo = 1;
        int hi = Arrays.stream(piles).max().getAsInt();
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (eatBananas(piles, mid) <= h) {
                answer = mid;      
                hi = mid - 1;
            } 
            else {
                lo = mid + 1;      
            }
        }

        return answer;
    }

    public static long eatBananas(int[] piles, int rate) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + rate - 1) / rate;
        }
        return hours;
    }

}
