import java.util.HashSet;

class Solution {
    public static long solution(int[] nums) {
        long answer = 0;
        HashSet<Long> hashSet = new HashSet<>();
        for(long kind : nums) {
            hashSet.add(kind);
        }
        if(hashSet.size() >= nums.length / 2) {
            answer = nums.length / 2;
        }else answer = hashSet.size();
        return answer;
    }
}