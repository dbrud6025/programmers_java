import java.util.LinkedList;
import java.util.Queue;


class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i = 0; i < progresses.length; i++) {
        	if((100 - progresses[i]) % speeds[i] != 0) {
        		days[i] = (100 - progresses[i]) / speeds[i] + 1;
        	}else {
        		days[i] = (100 - progresses[i]) / speeds[i];
        	}
        }
        
        for (int i = 0; i < days.length; ) {
            int idx = 1;
            while (i + idx < days.length && days[i] >= days[i + idx]) {
                idx++;
            }
            q.add(idx);
            i += idx;
        }
		
       return q.stream().mapToInt(Integer::intValue).toArray();
    }
}