class Solution {
        public static int search(int[] nums, int target) {
        int answer = -1;

        int lo = 0;
        int hi = nums.length-1;

        while(lo<=hi){
            int mid = lo + (hi - lo) / 2;

            if(nums[mid] == target){
                answer = mid;
                return answer;
            }
            else if(nums[mid] < target){
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }
        return answer;
    }
}
