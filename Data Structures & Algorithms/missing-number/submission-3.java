class Solution {
    public static int missingNumber(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        HashSet<Integer>range = new HashSet<>();
        HashSet<Integer>set = new HashSet<>();

        for(int i = 0 ; i<=nums[nums.length-1] ; i++){
            range.add(i);
            if(i<nums.length){
                set.add(nums[i]);
            }
        }

        range.removeAll(set);

        if(range.isEmpty()){
            answer = nums[nums.length-1]+1;
        }
        else{
            answer = range.stream().max(Comparator.naturalOrder()).get();
        }

        return answer;
    }
}
