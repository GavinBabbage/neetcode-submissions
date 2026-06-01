class Solution {
    public int tribonacci(int n) {
        int x = 0;
        int y = 1;
        int z = 1;
        int w = x + y + z;

        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        int index = 3;
        while(index<n){
            x = y;
            y = z;
            z = w;
            w = x + y + z;
            index++;
        }
        return w;
    }
}