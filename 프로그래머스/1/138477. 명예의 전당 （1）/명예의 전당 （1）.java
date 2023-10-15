import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            int[] list = new int[i + 1];
            for(int j = 0; j < i + 1; j++) {
                list[j] = score[j];
            }
            Arrays.sort(list);
            if(i < k) {
                answer[i] = list[0];
            }else {
                answer[i] = list[list.length - k];
            }
        }
        return answer;
    }
}