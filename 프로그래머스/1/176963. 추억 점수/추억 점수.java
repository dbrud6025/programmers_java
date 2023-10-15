import java.util.Arrays;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++) {
            for(String s : name) {
                if(Arrays.asList(photo[i]).contains(s)) {
                    answer[i] += yearning[Arrays.asList(name).indexOf(s)];
                }
            }

        }

        return answer;
    }
}