class Solution {
        public static int lastStoneWeight(int[] stones) {
        int answer = 0;
        
        if(stones.length == 1){
            return stones[0];
        }

        Stack <Integer> stoneStack = new Stack<>();
        for(int stone:stones){
            stoneStack.add(stone);
        }

        while(stoneStack.size() > 1){
            stoneStack.sort(Comparator.naturalOrder());
            int first = stoneStack.pop();
            int second = stoneStack.pop();
            if(first > second){
                stoneStack.add(first - second);
            }
            else if(second > first){
                stoneStack.add(second - first);
            }            
        }

        if(stoneStack.size() > 0){
            return stoneStack.pop();
        }
        else{
            return 0;
        }
    }
}
