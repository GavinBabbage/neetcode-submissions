class Solution {
    public static boolean isSubsequence(String s, String t) {
        boolean answer = false;
        Stack<Character> firstStringStack = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            firstStringStack.add(s.charAt(i));
        }

        
        for(int k = 0 ; k < t.length() ; k++){
            if(firstStringStack.isEmpty()){
                answer = true;
                return answer;
            }
            else{
                if(t.charAt(k)==firstStringStack.getFirst()){
                    firstStringStack.removeFirst();
                }
                if(firstStringStack.isEmpty()){
                    answer = true;
                }
            }
        }
        return answer;
    }
}