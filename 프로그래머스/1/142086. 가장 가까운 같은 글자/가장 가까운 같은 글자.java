import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
		String[] str = s.split("");
		int idx;
		for (int i = 0; i < str.length; i++) {
			if (i == 0) {
				answer[0] = -1;
			} else {
				idx = -1;
				String[] str2 = Arrays.copyOfRange(str, 0, i);
				for (int j = 0; j < i; j++) {
					if(str2[j].equals(str[i])) {
						idx = j;
					}
				}
				answer[i] = (idx == -1) ? -1 : i - idx;
			}

		}
		return answer;
    }
}