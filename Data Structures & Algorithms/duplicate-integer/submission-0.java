class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean answer = true;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            set.add(i);
        }
        
        if(set.size() == nums.length){
            answer = false;
        }
        return answer;
    }
}
