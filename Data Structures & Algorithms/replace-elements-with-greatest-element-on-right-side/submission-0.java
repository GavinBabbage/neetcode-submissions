class Solution {
    public static int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1]; 
        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j = i+1 ; j<arr.length-1 ; j++){
                if(arr[j]>=max){
                    max = arr[j];
                }
            }
            arr[i] = max;
            max = arr[arr.length-1]; 
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}