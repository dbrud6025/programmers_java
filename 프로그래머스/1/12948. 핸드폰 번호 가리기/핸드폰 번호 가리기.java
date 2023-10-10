class Solution {
    public StringBuilder solution(String phone_number) {
        String[] str = phone_number.split("");

        for(int i = 0; i < str.length - 4; i++) {
            str[i] = "*";
        }
        StringBuilder answer = new StringBuilder();
        for(String s : str) {
            answer.append(s);
        }
        return answer;
    }
}