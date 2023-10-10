class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrtN = Math.sqrt(n);
		if(sqrtN % 1 == 0.0) {
			answer = (long) ((sqrtN + 1) * (sqrtN + 1));
		}else {
			answer = -1;
		}
        return answer;
    }
}