class Solution {
    public String solution(int[] food) {
        StringBuilder 한사람 = new StringBuilder();

        for(int i = 1; i < food.length; i++) {
            int 개씩 = 0;
            개씩 = food[i] / 2;
            if(i == 1) {
                한사람.append("1".repeat(개씩));
            }else if(i == 2) {
                한사람.append("2".repeat(개씩));
            }else if(i == 3) {
                한사람.append("3".repeat(개씩));
            }else if(i == 4) {
                한사람.append("4".repeat(개씩));
            }else if(i == 5) {
                한사람.append("5".repeat(개씩));
            }else if(i == 6) {
                한사람.append("6".repeat(개씩));
            }else if(i == 7) {
                한사람.append("7".repeat(개씩));
            }else if(i == 8) {
                한사람.append("8".repeat(개씩));
            }
        }
        String check = String.valueOf(한사람.append("0"));
        for(int i = check.length() - 2; i >= 0; i--) {
            한사람.append(check.charAt(i));
        }

        String answer = String.valueOf(한사람);
        return answer;
    }
}