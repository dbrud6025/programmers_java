import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String numbers = br.readLine();

        int sum = 0;
        for (int i = 0; i < n; i++){
            int[] digit = new int[n];
            String[] num = numbers.split("");
            digit[i] = Integer.parseInt(num[i]);
            sum += digit[i];
        }

        System.out.println(sum);
    }
}