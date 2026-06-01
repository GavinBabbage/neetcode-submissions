class Solution {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int low = 0;
        int high = x;
        int answer = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square == x)
                return mid;  // Found exact square root
            else if (square < x) {
                low = mid + 1;
                answer = mid;  // Keep track of the last lower value
            } else {
                high = mid - 1;
            }
        }
        return answer;  // Return the closest integer value
    }
}