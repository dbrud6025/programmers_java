import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int start = 0;
        int finish = 0;
        int[] answer = new int[commands.length];
        int idx = 0;

        for(int i = 0; i < commands.length; i++) {
            start = commands[i][0]; 
            finish = commands[i][1]; 
            int[] arr = new int[finish - start + 1];
            for(int b = 0; b < finish - start + 1; b++) {
                arr[b] = array[b + start - 1];
            }
            Arrays.sort(arr);
            answer[idx++] = arr[commands[i][2] - 1];
        }
        return answer;
    }
}