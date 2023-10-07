import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int cnt = 0;

       main: for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            HashSet<Character> alphabet = new HashSet<>();
            char previousChar= ' ';

            for(char check : s.toCharArray()) {
                if(previousChar == ' ') {
                    alphabet.add(check);
                    previousChar = check;
                } else if(previousChar != check && alphabet.contains(check)) {
                    continue main;

                } else if(previousChar != check && !alphabet.contains(check)) {
                    previousChar = check;
                    alphabet.add(check);
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}