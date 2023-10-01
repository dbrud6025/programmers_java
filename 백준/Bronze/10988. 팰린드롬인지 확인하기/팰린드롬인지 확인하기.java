import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split("");
        String[] str2 = new String[s.length()];

        for(int i = 0; i < s.length(); i++){
            str2[i] = str[s.length()-1 - i];
        }
        if(Arrays.equals(str, str2)){
            System.out.println(1);
        }else System.out.println(0);
    }
}