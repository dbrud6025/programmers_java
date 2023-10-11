class Solution {
    public String solution(String s) {
       StringBuilder answer = new StringBuilder();
		String[] str = s.split("");
		if(s.length() % 2 != 0) {
			answer.append(str[s.length() / 2]);
		}else {
			answer.append(str[s.length() / 2 - 1]);
			answer.append(str[s.length() / 2]);
		}
		
		
		return String.valueOf(answer);
    }
}