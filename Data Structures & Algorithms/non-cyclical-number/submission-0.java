class Solution {
    public static boolean isHappy(int n) {
        boolean answer = false;

        HashSet<Integer> set = new HashSet<>();
        int temp = SplitSquare(n);

        while(!set.contains(temp)){
            set.add(temp);
            temp = SplitSquare(temp);

            if(temp == 1){
                answer = true;
                break;
            }
        }
        
        
        System.out.println(answer);
        return answer;
    }

    public static int SplitSquare(int n){
        int splitSquare = 0;
        int[] digits = String.valueOf(n).chars().map(c -> c - '0').toArray();
        for(int digit:digits){
            splitSquare += digit*digit;
        }
        return splitSquare;
    }
}
