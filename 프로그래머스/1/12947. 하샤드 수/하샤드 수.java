class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] str = String.valueOf(x).split("");
		int sum = 0;
		
		for(String s : str) {
			sum += Integer.parseInt(s);
		}
		if(x % sum == 0) answer = true;
		else answer = false;
        return answer;
    }
}