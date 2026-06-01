class Solution {
    public static boolean isPalindrome(String s) {
        boolean answer = false;

        String[] input = s.toLowerCase().replaceAll("[^a-z0-9_]", "").split("");
        int left = 0;
        int right  = input.length-1;
        while(left<=right){
            if(input[left].equals(input[right])){
                answer = true;
            }
            else{
                answer = false;
                break;
            }
            left++;
            right--;

        }
        return answer;
    }
}
