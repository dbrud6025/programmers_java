import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B) {
        //한 배열의 가장 작은 수와 한 배열의 가장 큰 수를 곱하면 최솟값이 나올 것 같다는 생각에서부터 시작!
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i < A.length; i++) {
        	answer += A[i] * B[B.length - 1 - i];
        }
        return answer;
    }
}