class Solution {
    public static int maxProfit(int[] prices) {
        int answer = 0;
        int left = 0;

        while(left< prices.length){
            int right = left + 1;
            for(int i = right ; i < prices.length ; i++){
                if(prices[i]-prices[left]>answer){
                    answer = prices[i]-prices[left];
                }
            }
            left++;
        }

        System.out.println(answer);
        return answer;
    }
}
