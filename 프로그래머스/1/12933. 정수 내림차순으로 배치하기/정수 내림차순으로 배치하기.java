import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = String.valueOf(n).split("");
		Arrays.sort(str, (x, y) -> y.compareTo(x));
		
		StringBuilder sb = new StringBuilder();
		for(String s : str) {
			sb.append(s);
		}
		answer = Long.parseLong(sb.toString());
        return answer;
    }
}