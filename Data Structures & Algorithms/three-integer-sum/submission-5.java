class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        if(nums.length==3 && (nums[0]+nums[1]+nums[2]==0)){
            List<Integer> pairs = new ArrayList<>();
            pairs.add(nums[0]);
            pairs.add(nums[1]);
            pairs.add(nums[2]);
            answer.add(pairs);
            return answer;
        }
        // x + y + z = 0 -> z = -x -y
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                int target = - nums[i] - nums[j];
                int index = Arrays.binarySearch(nums, target);
                if(index >= 0 && index != i && index != j){
                    List<Integer> pairs = new ArrayList<>();
                    pairs.add(nums[i]);
                    pairs.add(nums[j]);
                    pairs.add(nums[index]);
                    pairs.sort(Comparator.naturalOrder());
                    if(!answer.contains(pairs)){
                        answer.add(pairs);
                    }
                }
            }
        }
        return answer;
    }
}
