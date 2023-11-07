class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
    	Character[] chArr = new Character[s.length()];
        for(int i = 0; i < s.length(); i++) {
        	chArr[i] = s.charAt(i);
        }
        for(int i = 0; i < s.length(); i++) {
        	if(Character.isDigit(chArr[i])) { // 숫자인지 판별해주는 것! -> 숫자일 경우는 바로 append 해줘라!
                sb.append(chArr[i]);
//                while(chArr[i] == ' ') {
//                    sb.append(chArr[i].toString().toLowerCase());
//                    i++;
//                } -> char 배열로 들어오는거여서.. 이건 할 필요가 없는것!!(말이 안됨!)
        	}else if(chArr[i] == ' '){
        		sb.append(" ");
        	}else {
        		// i != 0 조건 추가 이유 : 안넣으면 ArrayIndexOutOfBounds Exception 발생!!
                if(i != 0 && chArr[i-1] == ' ') sb.append(chArr[i].toString().toUpperCase());
                // 맨 처음에 나오는 글자는 소문자로 입력되끼 때문에 무조건 uppercase해서 append 해줘라는 조건 추가!
                else if (i == 0) sb.append(chArr[i].toString().toUpperCase());
                else sb.append(chArr[i].toString().toLowerCase());
        	}
        }
        return sb.toString();
    }
}