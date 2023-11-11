class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
		int sumChange = 0;
		int c = 0;
		int sumZeroCnt = 0;

		while (!s.equals("1")) {
			int change = 0;
			int zeroCnt = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0') {
					zeroCnt++;
				}
			}
			c = s.length() - zeroCnt;
			s = Integer.toBinaryString(c);
			change++;
			sumZeroCnt += zeroCnt;
			sumChange += change;
		}

		answer[0] = sumChange;
		answer[1] = sumZeroCnt;
		return answer;
    }
}