class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>buckets = new HashMap<>();

        for (int num : nums) {
            if (buckets.containsKey(num)) {
                int oldCount = buckets.get(num);
                int newCount = oldCount + 1;
                buckets.put(num, newCount);
            } else {
                buckets.put(num, 1);
            }
        }

        int[] topKeys = buckets.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();

        System.out.println("Buckets: " + buckets.toString());
        System.out.println(Arrays.toString(topKeys));
        return topKeys;
    }
}
