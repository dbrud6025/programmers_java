import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();

        int[] sec = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            switch (ch) {
                case 'A' : sec[i] = 3; break;
                case 'B' : sec[i] = 3; break;
                case 'C' : sec[i] = 3; break;
                case 'D' : sec[i] = 4; break;
                case 'E' : sec[i] = 4; break;
                case 'F' : sec[i] = 4; break;
                case 'G' : sec[i] = 5; break;
                case 'H' : sec[i] = 5; break;
                case 'I' : sec[i] = 5; break;
                case 'J' : sec[i] = 6; break;
                case 'K' : sec[i] = 6; break;
                case 'L' : sec[i] = 6; break;
                case 'M' : sec[i] = 7; break;
                case 'N' : sec[i] = 7; break;
                case 'O' : sec[i] = 7; break;
                case 'P' : sec[i] = 8; break;
                case 'Q' : sec[i] = 8; break;
                case 'R' : sec[i] = 8; break;
                case 'S' : sec[i] = 8; break;
                case 'T' : sec[i] = 9; break;
                case 'U' : sec[i] = 9; break;
                case 'V' : sec[i] = 9; break;
                case 'W' : sec[i] = 10; break;
                case 'X' : sec[i] = 10; break;
                case 'Y' : sec[i] = 10; break;
                case 'Z' : sec[i] = 10; break;
            }
        }
        int sum = 0;
        for(int i : sec) {
            sum += i;
        }
        System.out.println(sum);
    }
}