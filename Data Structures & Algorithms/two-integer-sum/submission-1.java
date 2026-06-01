class Solution {
    public int[] twoSum(int[] nums, int target) {
       int []answer = new int[2];

        List<Integer>list = new ArrayList<Integer>();
        String x = "";

        for(int i=0 ; i< nums.length ; i++){
            list.add(nums[i]);
            if(list.contains(target-nums[i])){
                answer[0] = list.indexOf(target-nums[i]);
                answer[1] = i;
            }
        }


        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
