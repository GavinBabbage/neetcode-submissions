class Solution {
    public static int[] plusOne(int[] digits) {
        String inputString = Arrays.toString(digits).replaceAll("[ \\[ \\] \\ ,]" , "");
        String updatedValue = String.valueOf(Long.parseLong(inputString) + 1);
        int [] answer = new int[updatedValue.length()];
        for(int i=0 ; i< updatedValue.length() ; i++){
            answer[i] = Integer.parseInt(String.valueOf(updatedValue.charAt(i)));
        }

        return answer;
    }
}
