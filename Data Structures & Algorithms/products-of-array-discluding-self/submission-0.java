class Solution {
        public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int [nums.length];

        int index = 0;
        int total = 1;

        while(index < nums.length){

            for(int i = 0; i<nums.length ; i++){
                if(i==index){
                    continue;
                }
                else{
                    total*=nums[i];
                }
            }
            answer[index] = total;
            index++;
            total=1;
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}  
