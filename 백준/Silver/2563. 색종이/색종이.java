import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int black = 0;
        int paper = Integer.parseInt(br.readLine());
        boolean[][] white = new boolean[101][101];
        for(int i = 0; i < paper; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int a = 0; a < 10; a++) {
                for(int b = 0; b < 10; b++) {

                    if(!white[x + a][y + b]) {
                        white[x + a][y + b] = true;
                        black++;
                    }
                }
            }
        }

        System.out.println(black);
    }
}