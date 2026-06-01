class Solution {
        public static int findKthLargest(int[] nums, int k) {
        int answer = 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i:nums){
            minHeap.add(i);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        answer = minHeap.poll();

        return answer;
    }
}
