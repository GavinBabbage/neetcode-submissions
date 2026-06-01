class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();
        int length = Math.min(word1.length(), word2.length());
        String longerWord = word1.length() > word2.length() ? word1 : word2;
        for(int i=0; i<length; i++){
            answer.append(word1.charAt(i));
            answer.append(word2.charAt(i));
        }
        answer.append(longerWord.substring(length, longerWord.length()));
        return answer.toString();
    }
}