import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] st = new String[n-1];
        String [] st2 = new String[n-1];
        String star = "*";

        for(int i = 1; i < n; i++) {
            st[i-1] = star.repeat(2 * i -1);
            String star1 = String.format("%" + (n + i -1) + "s", st[i - 1]);
            System.out.println(star1);
        }

        System.out.println(star.repeat(2 * n - 1));

        for(int i = n-1; i > 0; i--){
            st2[n-i-1] = star.repeat(2 * i - 1);
            String star2 = String.format("%" + (n + i -1) + "s", st2[n-i-1]);
            System.out.println(star2);
        }
    }
}