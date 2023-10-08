class Solution {
    public double solution(double n) {
        double answer = 0;
        if(Math.sqrt(n) % 1 != 0.0) {
            answer = 2;
        } else answer = 1;
        return answer;
    }
}