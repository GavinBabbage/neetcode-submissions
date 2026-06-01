class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }

        List<List<String>> answer = new ArrayList<>(map.values());

        Collections.sort(answer, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> list1, List<String> list2) {
                return Integer.compare(list1.size(), list2.size());
            }
        });
        System.out.println(answer);
        return answer;
    }

}
