class Solution {
    public static int findMin(int[] nums) {
        int answer = Arrays.stream(nums).min().getAsInt();
        return answer;
    }
}
