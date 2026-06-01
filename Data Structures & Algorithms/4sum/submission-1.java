class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        if(nums.length==4 && ((long)nums[0]+nums[1]+nums[2]+nums[3] == (long)target)){
            List<Integer> pairs = new ArrayList<>();
            pairs.add(nums[0]);
            pairs.add(nums[1]);
            pairs.add(nums[2]);
            pairs.add(nums[3]);
            answer.add(pairs);
            System.out.println(answer);
            return answer;
        }
        // a + b + c + d = target -> a = target - b - c - d
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                for(int k=j+1 ; k<nums.length ; k++){
                    long temp = (long)target - (long)nums[i] - (long)nums[j] - (long)nums[k];
                    for(int l=k+1 ; l<nums.length ; l++){
                        if((long)nums[l] == temp && l != i && l != j && l != k){
                            List<Integer> quadruplets = new ArrayList<>();
                            quadruplets.add(nums[i]);
                            quadruplets.add(nums[j]);
                            quadruplets.add(nums[k]);
                            quadruplets.add(nums[l]);
                            quadruplets.sort(Comparator.naturalOrder());
                            if(!answer.contains(quadruplets)){
                                answer.add(quadruplets);
                            }
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}