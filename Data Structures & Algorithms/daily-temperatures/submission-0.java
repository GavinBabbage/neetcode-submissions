class Solution {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[]answer = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int j = i + 1;
            while (j < temperatures.length) {
                if (temperatures[i] < temperatures[j]) {
                    answer[i] = j - i;
                    break;
                }
                j++;
            }
        }
        return answer;
    }
}
