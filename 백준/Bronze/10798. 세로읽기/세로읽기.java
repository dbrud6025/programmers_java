import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[5]; // 다섯 줄의 문자열을 저장할 배열 생성
        int maxLength = 0; // 입력된 다섯 줄 중 가장 긴 줄의 길이를 저장할 변수

        for (int i = 0; i < 5; i++) {
            str[i] = sc.nextLine(); // 다섯 줄의 문자열 입력 받기
            maxLength = Math.max(maxLength, str[i].length()); // 최대 길이 업데이트
        }

        // 다섯 줄의 문자열을 세로로 출력
        for (int j = 0; j < maxLength; j++) {
            for (int i = 0; i < 5; i++) {
                if(j < str[i].length()) {
                    char ch = str[i].charAt(j);
                    System.out.print(ch);
                }
            }
        }


    }
}