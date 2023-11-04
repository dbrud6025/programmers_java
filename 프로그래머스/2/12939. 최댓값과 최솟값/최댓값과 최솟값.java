import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(); //공백을 더해주고 싶어서!
		String[] str = s.split(" "); //string 배열에 나눠 넣고 list에도 넣기!
		
		List<Integer> number = new ArrayList<>();
		for(int i = 0; i < str.length; i++) {
			number.add(Integer.parseInt(str[i]));
		}
		Collections.sort(number); //오름차순 정렬해서 맨 앞 숫자 + 공백 + 맨 뒤 숫자 (어차피 세 개만 더하니까!)
		
		sb.append(Integer.toString(number.get(0)))
            .append(" ")
            .append(Integer.toString(number.get(number.size()-1)));
		
		return sb.toString();
    }
}