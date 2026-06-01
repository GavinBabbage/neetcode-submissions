class Solution {
    public static String multiply(String num1, String num2) {
        String answer = "0";
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);
        answer = String.valueOf(n1 * n2);
        
        return answer;
    }
}
