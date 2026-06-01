class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int answer = Integer.MAX_VALUE;
        int count = 0;
        int index = 0;
        int sum = 0;

        while(index<nums.length){
            for(int i=index ; i < nums.length ; i++){
                sum+=nums[i];
                count++;
                if(sum >= target){
                    answer = count < answer ? count:answer;
                }
            }
            sum = 0;
            index++;
            count = 0;
        }
        
        if(answer == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return answer;
        }
    }
}