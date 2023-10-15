class Solution {
    public String solution(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        String[] words = s.split(" ", -1); // Use -1 to keep trailing empty strings
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char currentChar = words[i].charAt(j);
                if (j % 2 == 0) {
                    result.append(Character.toUpperCase(currentChar));
                } else {
                    result.append(Character.toLowerCase(currentChar));
                }
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}