class Solution {
    public static String gcdOfStrings(String str1, String str2) {
        String shorter = str1.length() > str2.length() ? str2 : str1;
        String longer = str1.length() > str2.length() ? str1 : str2;
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLen = gcd(shorter.length(), longer.length());
        return shorter.substring(0, gcdLen);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}