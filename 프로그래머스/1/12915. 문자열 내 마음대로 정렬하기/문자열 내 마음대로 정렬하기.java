import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
       String[] answer = new String[strings.length];
        for(int i = 0; i < strings.length; i++) {
        	answer[i] = strings[i].charAt(n) + strings[i];
        	//usun, ebed, acar
        }
        Arrays.sort(answer); //acar, ebed, usun
        for(int i = 0; i < strings.length; i++) {
        	answer[i] = answer[i].substring(1, answer[i].length()); 
        }
        return answer;
    }
}