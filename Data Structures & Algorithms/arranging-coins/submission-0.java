class Solution {
    public static int arrangeCoins(int n) {
        int count = 0;
        int length = n;

        for(int i=0 ; i<length ; i++){
            count++;
            length= length - count;
    
            if(count>length){
                break;
            }
        }
        return count;
    }
}