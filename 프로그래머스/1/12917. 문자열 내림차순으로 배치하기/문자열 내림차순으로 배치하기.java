import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("");
        Arrays.sort(str, Comparator.reverseOrder()); // 내림차순
        for(String string : str) {
        	sb.append(string);
        }
        
        return String.valueOf(sb);
    }
}