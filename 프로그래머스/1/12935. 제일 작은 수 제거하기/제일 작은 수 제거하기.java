import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int minVal = 10000;
        int minIdx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < minVal) {
                minVal = arr[i];
                minIdx = i;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if (i != minIdx) {
                list.add(arr[i]);
            }else if (arr.length == 1) {
                list.add(-1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}