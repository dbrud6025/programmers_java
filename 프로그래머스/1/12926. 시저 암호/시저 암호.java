class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] sToChar = s.toCharArray();
        for(int i = 0; i < sToChar.length; i++) { 
        	if(sToChar[i] == ' ') {
        		answer.append(' ');
        	}else if(sToChar[i]>= 'A' && sToChar[i] <= 'Z') {
        		char ch = (char) ('A' + ((sToChar[i] - 'A' + n) % 26));
        		answer.append(ch);
        	}else if(sToChar[i]>= 'a' && sToChar[i] <= 'z') {
        		char ch = (char) ('a' + ((sToChar[i] - 'a' + n) % 26));
        		answer.append(ch);
        	}else {
        		char ch = (char) sToChar[i];
        		answer.append(ch);
        	}
        }
        
        return answer.toString();
    }
}