class Solution {
    public static double myPow(double x, int n) {
        double answer = 1.0;
        long N = n;
        if (N < 0) N = -N;
        while (N > 0) {
            if ((N & 1) == 1) answer *= x;
            x *= x;
            N >>= 1;
        }
        if (n < 0) answer = 1 / answer;
        return answer;
    }
}
