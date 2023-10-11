import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                hashSet.add(sum);
            }
        }
        int[] answer = new int[hashSet.size()];
        int idx = 0;
        for(int i : hashSet) {
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }
}