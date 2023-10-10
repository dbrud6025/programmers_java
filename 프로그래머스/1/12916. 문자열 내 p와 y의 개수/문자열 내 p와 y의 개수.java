class Solution {
    boolean solution(String s) {
        boolean answer = true;
		String lowerS = s.toLowerCase();
		String[] str = lowerS.split("");
        
        int numT = 0;
		int numY = 0;
		
		for(int i = 0; i < str.length; i++) {
			if( str[i].equals("p") ) {
                numT++;
            }else if( str[i].equals("y") ) {
                numY++;
            } 
		}
		
		if(numT == numY) {
            answer = true;
        } else if(numT != numY) {
            answer = false;
        }

        return answer;
    }
}