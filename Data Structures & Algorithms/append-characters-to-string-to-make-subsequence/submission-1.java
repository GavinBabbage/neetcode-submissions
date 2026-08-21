class Solution {
    public static int appendCharacters(String s, String t) {
        int j = 0;
        for (int i = 0; i < s.length() && j < t.length(); i++) {
            if (s.charAt(i) == t.charAt(j)) {
                j++; 
            }
        }

        int answer = t.length() - j;
        return answer;
    }
}