import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++){
            String s = "*";
            String space = " ";
            bw.write(space.repeat(t - i) + s.repeat(i) + "\n");
        }
        bw.flush();

        }

    }