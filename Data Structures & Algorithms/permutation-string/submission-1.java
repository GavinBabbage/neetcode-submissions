class Solution {
    public static boolean checkInclusion(String s1, String s2) {
        boolean answer = false;
        ArrayList<Character> list = new ArrayList();
        for(int i = 0 ; i < s1.length() ; i++){
            list.add(s1.charAt(i));
        }
        

        int count = 0;
        int index = 0;
        
        while(index < s2.length() - s1.length()+1){
            for(int i = index ; i < index + s1.length(); i++){
                if(list.contains(s2.charAt(i))){
                    count++;
                    list.remove(list.indexOf(s2.charAt(i)));
        
                    if(count == s1.length()){
                        answer = true;
                        return answer;
                    }
                }
            }
            index++;  
            list.clear();
            for(int k = 0 ; k < s1.length() ; k++){
                list.add(s1.charAt(k));
            }
            count = 0;
        }
        return answer;
    }
}
