class Solution {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        String [] words = s.split(" ");
        length = words[words.length-1].length();
        return length;
    }
}