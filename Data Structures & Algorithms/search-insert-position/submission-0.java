class Solution {
    public int searchInsert(int[] nums, int target) {
        int answer = 0;
        answer = Arrays.binarySearch(nums, target);
        if(answer < 0){
            answer = -answer - 1;
        }
        return answer;
    }
}