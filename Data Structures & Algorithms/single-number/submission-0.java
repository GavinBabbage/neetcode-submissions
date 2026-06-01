class Solution {
    public static int singleNumber(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }
        for(int i : set){
            answer = i;
        }

        return answer;
    }
}
