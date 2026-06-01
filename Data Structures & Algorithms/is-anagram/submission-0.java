class Solution {
    public boolean isAnagram(String s, String t) {
   boolean answer = false;
        String[]first = s.split("");
        String[]second = t.split("");

        Arrays.sort(first);
        Arrays.sort(second);

        if(first.length == second.length){
            for(int i=0 ; i< first.length ; i++){
                if(first[i].compareToIgnoreCase(second[i]) == 0){
                    answer = true;
                }
                else{
                    answer=false;
                    break;
                }
            }
        }
        
        return answer;
    }
}
