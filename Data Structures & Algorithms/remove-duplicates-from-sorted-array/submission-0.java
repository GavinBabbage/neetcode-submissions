class Solution {
    public int removeDuplicates(int[] nums) {
        int result =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        result = set.size();
        int[] unique = set.stream().mapToInt(Integer::intValue).sorted().toArray();
        System.arraycopy(unique, 0, nums, 0, unique.length);
        return result;
    }
}