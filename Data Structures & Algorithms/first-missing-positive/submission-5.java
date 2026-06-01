class Solution {
    public static int firstMissingPositive(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(nums[0]>1 || num+1 == 0 && Arrays.binarySearch(nums, 1) < 0){
                set.add(1);
            }
            map.put(num, num+1);
            set.add(num+1);
        }
        for(int i : set){
            if(!map.containsKey(i) && i>0){
                list.add(i);
                list.sort(Comparator.naturalOrder());
                answer = list.get(0);       
            }
        }
            return answer;
    }
}