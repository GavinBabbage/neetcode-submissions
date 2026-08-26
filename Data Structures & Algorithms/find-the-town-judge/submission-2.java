class Solution {
    public static int findJudge(int n, int[][] trust) {
        int judge = -1;
        Arrays.sort(trust, (a, b) -> Integer.compare(a[0], b[0]));

        HashSet<Integer> citizens = new HashSet<>();
        for(int i = 1 ; i <= n ; i++){
            citizens.add(i);
        }
        
        
        HashSet<Integer> trusters = new HashSet<>();
        HashSet<Integer> trusted = new HashSet<>();
        for(int j = 0 ; j < trust.length ; j++){
            trusters.add(trust[j][0]);
            trusted.add(trust[j][1]);
        }

        System.out.println("Trusters : " + trusters);
        
        citizens.removeAll(trusters);
        trusted.removeAll(trusters);
        
        int [] judgeCandidateArray = new int[trusted.size()];
        for(int i = 0 ; i < trusted.size() ; i++){
            judgeCandidateArray[i] = trusted.iterator().next();
            trusted.remove(judgeCandidateArray[i]);
        }
        

        int count = trusters.size();
        int maxCount = trusters.size();
        for(int j = 0 ; j < judgeCandidateArray.length ; j++){
            for(int k = 0 ; k < trust.length ; k++){
                
                if(trust[k][0]== trusters.iterator().next()&& trust[k][1] == judgeCandidateArray[j]){
                    count--;
                    trusters.remove(trusters.iterator().next());
                    
                }
                
                
                if(count == 0){
                    judge = judgeCandidateArray[j];
                    break;
                }
                else{
                    judge = -1;
                }
                
            }
            count = maxCount;
        }
        
        return judge;
    }
}