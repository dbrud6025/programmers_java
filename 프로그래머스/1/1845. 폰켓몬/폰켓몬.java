import java.util.HashSet;

class Solution {
    public static int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int kind : nums) {
            hashSet.add(kind);
        }
        if(hashSet.size() >= nums.length / 2) {
            answer = nums.length / 2;
        }else answer = hashSet.size();
        return answer;
    }
}