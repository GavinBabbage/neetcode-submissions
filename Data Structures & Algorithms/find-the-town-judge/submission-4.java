class Solution {
        public static int findJudge(int n, int[][] trust) {
        int judge = -1;
        Arrays.sort(trust, (a, b) -> Integer.compare(a[0], b[0]));
        
        HashSet<Integer> trusters = new HashSet<>();
        HashSet<Integer> trusted = new HashSet<>();
        for(int j = 0 ; j < trust.length ; j++){
            trusters.add(trust[j][0]);
            trusted.add(trust[j][1]);
        }
        
        trusted.removeAll(trusters);
        
        

        int count = trusters.size();
        for(int j = 0 ; j < trusted.size() ; j++){
            for(int k = 0 ; k < trust.length ; k++){
                if(trust[k][0]== trusters.iterator().next()&& trust[k][1] == trusted.iterator().next()){
                    count--;
                    trusters.remove(trusters.iterator().next()); 
                }
                if(count == 0){
                    judge = trusted.iterator().next();
                    break;
                }
                else{
                    judge = -1;
                }
            }
        }
        return judge;
    }
}