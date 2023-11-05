class Solution {
    public int solution(String s) {
        int answer = 0;
		StringBuilder sb = new StringBuilder();
		int i = 0; // 인덱스를 따로 관리

		while (i < s.length()) {
			if (Character.isDigit(s.charAt(i))) {
				sb.append(s.charAt(i));
				i++;
			} else {
				if (i + 2 < s.length() && s.charAt(i) == 'o') {
					sb.append('1');
					i += 3;
				} else if (i + 2 < s.length() && s.charAt(i) == 't') {
					if (s.charAt(i + 1) == 'w') {
						sb.append('2');
						i += 3;
					} else if (i + 3 < s.length() && s.charAt(i + 1) == 'h') {
						sb.append('3');
						i += 5;
					}
				} else if (i + 2 < s.length() && s.charAt(i) == 'f') {
					if (s.charAt(i + 1) == 'o') {
						sb.append('4');
						i += 4;
					} else if (s.charAt(i + 1) == 'i') {
						sb.append('5');
						i += 4;
					}
				} else if (i + 1 < s.length() && s.charAt(i) == 's') {
					if (s.charAt(i + 1) == 'i') {
						sb.append('6');
						i += 3;
					} else if (i + 3 < s.length() && s.charAt(i + 1) == 'e') {
						sb.append('7');
						i += 5;
					}
				} else if (i + 3 < s.length() && s.charAt(i) == 'e') {
					sb.append('8');
					i += 5;
				} else if (i + 2 < s.length() && s.charAt(i) == 'n') {
					sb.append('9');
					i += 4;
				} else if (i + 3 < s.length() && s.charAt(i) == 'z') {
					sb.append('0');
					i += 4;
				} else {
					// 만약에 어떤 조건도 만족하지 않을 때, 반복을 종료
					break;
				}
			}
		}
		answer = Integer.parseInt(sb.toString());
		return answer;
    }
}