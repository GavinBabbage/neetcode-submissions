class Solution {
    public static String longestPalindrome(String s) {
        String answer = "";
        if(s.length() == 1){
            return s;
        }

        int index = 0;
        while(index<s.length()){
            for(int i = index ; i<s.length() ; i++ ){
                StringBuilder  sb = new StringBuilder(s.substring(index, i+1));
                sb.reverse();
                if(s.substring(index, i+1).equals(sb.toString()) && sb.length() >= answer.length() ){
                    answer = s.substring(index, i+1);
                }
            }
            index++;
        }
        return answer;
    }
}
