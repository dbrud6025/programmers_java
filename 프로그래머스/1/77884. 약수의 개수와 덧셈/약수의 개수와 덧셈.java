class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int[] arr = new int [right - left + 1];
        
        int[] divisorArr = new int[right - left + 1];
        int idx = 0;
        
	    for(int num = left; num < right + 1; num++) {
	    	int divisor = 1;
	    	for(int i = 1; i <= num/2; i++) {
	           if(num % i == 0) {
	            divisor++;
	            
	           }
	        }
	        
	        divisorArr[idx] = divisor;
	        idx++;
	    }

	for(

	int i = 0;i<right-left+1;i++)
	{
		arr[i] = left + i;
	}

	for(
	int i = 0;i<right-left+1;i++)
	{
		if (divisorArr[i] % 2 == 0) {
			answer += arr[i];
		} else
			answer -= arr[i];
	}

	return answer;
    }
}