class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a) {
            int 몫 = n / a;
            int 나머지 = n % a;
            answer += 몫 * b;
            n = 몫 * b + 나머지;
        }
        return answer;
    }
}