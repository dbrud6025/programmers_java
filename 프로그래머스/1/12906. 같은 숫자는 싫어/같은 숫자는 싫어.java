import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int lastint = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != lastint){
                lastint = arr[i];
                list.add(arr[i]);
            }else lastint = arr[i];
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }
        //다른 방법
        //int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}