import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        
        	for(int i = 0; i < d.length; i++) {
            	sum += d[i];
            	answer = i + 1;
            	if(sum > budget) {
            		answer -= 1; break;
            	}else if(sum == budget) {
            		answer = answer;
            	}
        	} 
        
        return answer;
    }
}