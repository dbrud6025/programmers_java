import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] abc = new int[26];
        for(int i = 0; i < abc.length; i++) {
            abc[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(abc[ch - 'a'] == -1) {
                abc[ch - 'a'] = i;
            }
        }

        for(int i : abc) {
            System.out.print(i + " ");
        }

    }
}