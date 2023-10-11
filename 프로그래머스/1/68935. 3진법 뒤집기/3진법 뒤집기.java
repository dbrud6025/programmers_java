class Solution {
    public int solution(int n) {
        String s = Integer.toString(n, 3);
        String[] str = s.split("");
        String[] reverse = new String[s.length()];
        for(int i = 0; i < s.length(); i++) {
            reverse[i] = str[s.length() - 1 - i];
        }
        StringBuilder sb = new StringBuilder();
        for(String string : reverse) {
            sb.append(string);
        }
        int answer = Integer.parseInt(String.valueOf(sb), 3);
        return answer;
    }
}