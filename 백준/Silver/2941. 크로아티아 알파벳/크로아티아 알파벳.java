import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int len = s.length();
        int cnt = 0;

        for(int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == 'c' && i < len - 1) {
                if(s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    i++;
                }
            }
            else if (ch == 'd' && i < len - 1) {
                if (s.charAt(i + 1) == '-') {
                    i++;
                }
                else if (s.charAt(i + 1) == 'z' && i < len - 2) {
                    if (s.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            }
            else if((ch == 'l' || ch == 'n') && i < len - 1) {
                if (s.charAt(i + 1) == 'j') {
                    i++;
                }
            }
            else if ((ch == 's' || ch == 'z') && i < len - 1) {
                if (s.charAt(i + 1) == '=') {
                    i++;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}