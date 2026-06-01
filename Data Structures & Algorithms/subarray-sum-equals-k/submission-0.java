class Solution {
        public int subarraySum(int[] nums, int k) {
        int answer = 0;
        int index = 0;
        int sum = 0;
        
        if(nums.length == 1 && nums[0] == k){
            return 1;
        }
        
        while(index<nums.length){
            for(int i = index ; i<nums.length ; i++){
                sum+=nums[i];
                if(sum==k){
                    answer++;
                    continue;
                }
            }
            sum = 0;
            index++;
        }
        return answer;
    }
}