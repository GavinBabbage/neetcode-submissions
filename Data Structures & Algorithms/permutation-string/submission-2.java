class Solution {
        public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            list.add(s1.charAt(i));
        }

        int index = 0;
        while (index <= s2.length() - s1.length()) {
            ArrayList<Character> temp = new ArrayList<>(list);
            int count = 0;

            for (int i = index; i < index + s1.length(); i++) {
                if (temp.contains(s2.charAt(i))) {
                    count++;
                    temp.remove(temp.indexOf(s2.charAt(i)));
                    if (count == s1.length()) {
                        return true;
                    }
                } else {
                    break;
                }
            }
            index++;
        }
        return false;
    }
}
