class Solution {
    public int solution(int num) {
        int answer = 0;
        long number = (long) num;
        for(int i = 0; i < 500; i++) {
            if(number == 1) {
                return answer;
            }
            if (number % 2 == 0) {
				number /= 2;
				answer++;
			}else if (number % 2 != 0) {
				number = number * 3 + 1;
				answer++;
			}
        }
        return -1;
    }
}