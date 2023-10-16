class Solution {
    public int solution(int[][] sizes) {
        int maxMax = 0; // 가로의 최대 길이
        int minMax = 0; // 세로의 최대 길이

        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);

            if (width > maxMax) {
                maxMax = width;
            }

            if (height > minMax) {
                minMax = height;
            }
        }

        int answer = maxMax * minMax; // 가로 * 세로
        return answer;
    }
}