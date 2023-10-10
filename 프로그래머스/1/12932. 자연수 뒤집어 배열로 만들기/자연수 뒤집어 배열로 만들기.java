class Solution {
    public int[] solution(long n) {
        String[] strN = String.valueOf(n).split("");
        int[] answer = new int[strN.length];
        
        for(int i = 0; i < strN.length; i++) {
            answer[i] = Integer.parseInt(strN[strN.length - i - 1]);
        }
        
        return answer;
    }
}