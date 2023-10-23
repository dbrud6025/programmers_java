class Solution {
    public int solution(int n) {
        if (n < 2) {
            return 0;
        }
        
        int answer = 1; // 2는 소수이므로 2부터 시작
        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                answer++;
            }
        }
        return answer;
    }
}