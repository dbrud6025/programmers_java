class Solution {
    public int[] solution(int n, int m) {
        int 최대공약수 = 0;
        int 최소공배수 = 0;
        int[] answer = new int[2];

        int min = (n < m)? n : m;
        for(int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                최대공약수 = i;
            }
        }
        최소공배수 = (n * m) / 최대공약수;
        answer[0] = 최대공약수;
        answer[1] = 최소공배수;


        return answer;
    }
}