class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 0l;
        for(int i = 0; i < n; i++) {
            sum += x;
            answer[i] = sum;
        }
        return answer;
    }
}