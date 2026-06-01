class Solution {
    public boolean validPalindrome(String s) {
        Boolean answer = false; 
        int index = 0;
        StringBuilder sb = new StringBuilder(s);
        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        }
        sb.reverse();

        while(index<sb.length()){
            sb.deleteCharAt(index);
            if(sb.toString().equals(sb.reverse().toString())){
                answer = true;
                break;
            }
            index++;
            sb.delete(0, sb.length());
            sb.append(s);
        }
        // System.out.println(answer);
        return answer;
    }
}