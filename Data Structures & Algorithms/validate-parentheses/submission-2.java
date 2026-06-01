class Solution {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0 || s.length() == 0) {
            return false; // Odd length or empty string can't be valid
        }

        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        Stack<Character> openStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                openStack.push(c);
            } else {
                if (openStack.isEmpty()) {
                    return false; // Closing bracket with no opening
                }
                char lastOpen = openStack.peek();
                if (lastOpen != brackets.get(c)) {
                    return false; // Mismatched brackets
                }
                openStack.pop();
            }
        }

        return openStack.isEmpty(); // True if all opened brackets were closed
    }
}