class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] str = t.split(""); 
        StringBuilder sb = new StringBuilder();
        
        for(int j = 0; j < t.length()-(p.length() -1); j++) {
        	sb.setLength(0);
        	for(int i = j; i < j + p.length(); i++) { 
            	sb.append(str[i]);        	
            }
        	if(Long.parseLong(sb.toString()) <= Long.parseLong(p)) {
        		answer++;
        	}
        }
        
        return answer;
    }
}