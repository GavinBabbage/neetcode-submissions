class Solution {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int target = 0;
        int count = 1;
        
        if(nums.length ==1 ){
            return nums[0];
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > nums.length / 2) {
                target = nums[i];
                break;
            }
        }
        return target;
    }
}