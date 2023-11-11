class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt1 = 0;
        int cnt2 = 1;
        String nString = "";
        
        nString = Integer.toBinaryString(n);
    	for(int i = 0; i < nString.length(); i++) {
    		if(nString.charAt(i)=='1') cnt1++;
    	}
    	
        while(cnt1 != cnt2) {
        	cnt2 = 1;
        	cnt2--;
        	n++;
        	nString = Integer.toBinaryString(n);
        	for(int i = 0; i < nString.length(); i++) {
        		if(nString.charAt(i)=='1') cnt2++;
        	}
        	if(cnt1 == cnt2) answer = n;
        }
        return answer;
    }
}