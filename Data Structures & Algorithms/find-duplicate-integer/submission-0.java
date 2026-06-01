class Solution {
    public static int findDuplicate(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(set.contains(i)){
                answer = i;
                break;
            }else{
                set.add(i);
            }
        }
        return answer;
    }
}
