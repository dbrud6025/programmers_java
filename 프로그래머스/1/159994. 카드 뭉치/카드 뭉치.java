class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int goalIdx = 0, oneIdx = 0, twoIdx = 0;
        while(true) {
            if(oneIdx < cards1.length && goal[goalIdx].equals(cards1[oneIdx])) {
                oneIdx++;
            }else if(twoIdx < cards2.length && goal[goalIdx].equals(cards2[twoIdx])) {
                twoIdx++;
            }else {
                answer = "No";
                break;
            }
            goalIdx++;
            if(goalIdx == goal.length) {
                answer = "Yes";
                break;
            }
        }
        return answer;
    }
}