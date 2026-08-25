public class KthLargest {
    private final int k;
    private final ArrayList<Integer> numsList;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.numsList = new ArrayList<>();
        for (int n : nums) {
            numsList.add(n);
        }
        Collections.sort(numsList);
        Collections.reverse(numsList);
    }

    public int add(int val) {
        numsList.add(val);
        Collections.sort(numsList);
        Collections.reverse(numsList);
        return numsList.get(k - 1);
    }
}
