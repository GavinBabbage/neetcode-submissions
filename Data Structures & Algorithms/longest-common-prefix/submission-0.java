class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            String current = strs[i];
            int j = 0;
            for (; j < Math.min(prefix.length(), current.length()); j++) {
                if (prefix.charAt(j) != current.charAt(j)) {
                    break;
                }
            }
            prefix = prefix.substring(0, j);
            if(prefix.isEmpty()) {
                return "";
            }
        }
        // System.out.println(prefix);
        return prefix;
    }
}