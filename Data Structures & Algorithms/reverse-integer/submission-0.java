class Solution {
    public static int reverse(int x) {
        int answer = 0;
        int max = Integer.MAX_VALUE;
        String xString = String.valueOf(x);
        String sign = String.valueOf(x).substring(0,1);
        StringBuilder sb = new StringBuilder();
        if(sign.equals("-")){
            sb.append(sign);
            for(int i = xString.length() ; i>1 ; i--){
                sb.append(xString.substring(i-1,i));
            }
        }
        else{
            for(int i = xString.length() ; i>0 ; i--){
                sb.append(xString.substring(i-1,i));
            }
        }

        try{
            answer = Integer.parseInt(sb.toString());
        }
        catch(Exception e){
            answer = 0;
        }
        
        return answer;
    }
}
