class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> answer = new ArrayList<>();
        int threshold = nums.length/3;
        int count = 0;
        int target = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            if (threshold == 0) {
                if (i == 0 || nums[i] != nums[i - 1]) {
                    answer.add(nums[i]);
                }
                continue;
            }
            else{
                if(nums[i] == target){
                    count++;
                    if(count>threshold && !answer.contains(target)){
                        answer.add(target);
                    }
                }
                else{
                    target = nums[i];
                    count = 1;
                }
            }
        }
        return answer;
    }
}