import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

		Stack<String> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				stack.push("(");
			else if (s.charAt(i) == ')') {
				if(stack.empty()) {
					answer = false;
					break;
				}
				stack.pop();
			}
		}
		if (!stack.empty())
			answer = false;

		return answer;
        
        
                              
                
        /*
        boolean answer = true;
        //3가지만 생각함
        //1. ')'이 0번째이면 false
        //2. '('의 개수와 ')'의 개수가 다르면 false
        //3. '('이 마지막 번째이면 false
        
        if(s.startsWith(")")) answer = false;
        
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '(') cnt1++;
        	if(s.charAt(i) == ')') cnt2++;
        }
        if(cnt1 != cnt2) answer = false;
        
        if(s.endsWith("(")) answer = false;

        return answer;
        */
    }
}