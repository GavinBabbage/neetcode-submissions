class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int left = 0;
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(map.get(c) + 1, left);
            }
            ans = Math.max(ans, right - left + 1);
            map.put(c, right);
        }
        System.out.println(ans);
        return ans;
    }
}
