import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strArray = new String[numbers.length];

        //int 배열을 string 배열로 바꾸기
        for(int i = 0; i < numbers.length; i++) {
            strArray[i] = String.valueOf(numbers[i]);
        }
        
/*        Arrays.sort(strArray);
        
        //앞에서부터 두개씩 비교하면서 만들어 나가기
        for(int i = 0; i < strArray.length; i++) {
    		if(strArray[i].equals("0")) {
    			answer += "0";
    		}else {
    			String a = answer + strArray[i];
        		String b = strArray[i] + answer;
        		if(a.compareTo(b) >= 0) {
        			answer = a;
        		}else {
        			answer = b;
        		}
    		}
        }
*/        
        Arrays.sort(strArray, (a, b) -> (b + a).compareTo(a + b));

        // 배열을 이용해 문자열 만들기
        for (String str : strArray) {
            answer += str;
        }
        
        //int 배열 모두 0 일 수도 있으니 case 추가
        if (answer.charAt(0) == '0') {
            return "0";
        }
        return answer;
    }
}