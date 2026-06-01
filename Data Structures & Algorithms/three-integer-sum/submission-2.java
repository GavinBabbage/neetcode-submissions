class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        if(nums.length==3 && (nums[0]+nums[1]+nums[2]==0)){
            List<Integer> pairs = new ArrayList<>();
            pairs.add(nums[0]);
            pairs.add(nums[1]);
            pairs.add(nums[2]);
            answer.add(pairs);
            System.out.println(answer);
            return answer;
        }

        int index = 0;
        while(index < nums.length){
            for(int i = index+1 ; i < nums.length ; i++){
                for(int j = i+1 ; j < nums.length ; j++){
                    if(nums[index]+nums[i]+nums[j]==0){
                        List<Integer> pairs = new ArrayList<>();
                        pairs.add(nums[index]);
                        pairs.add(nums[i]);
                        pairs.add(nums[j]);
                        pairs.sort(Comparator.naturalOrder());
                        if(!answer.contains(pairs)){
                            answer.add(pairs);
                        }
                        
                    }
                }
            }
            index++;
        }
        return answer; 
    }
}
