
import java.util.ArrayList;
import java.util.List;


class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> wordPass = new ArrayList<String>();
       
        for(int i = 0; i < words.length; i++) {
        	if(i == 0) {
        		wordPass.add(words[i]);
        	}
        	else if(i < words.length) {
        		if(!wordPass.contains(words[i]) && words[i].charAt(0) == words[i - 1].charAt(words[i - 1].length() - 1)) {
            		wordPass.add(words[i]);
            	}else {
            		answer[0] = i % n + 1;
            		answer[1] = i / n + 1;
            		break;
            	}
        	}
        }
        
        return answer;
    }
}