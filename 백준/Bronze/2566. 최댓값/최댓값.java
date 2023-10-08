import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] number = new int[9][9];
        int max = -1;
        int i, j, maxi = 0, maxj = 0;
        for(i = 0; i < 9; i++) {
            for(j = 0; j < 9; j++) {
                number[i][j] = sc.nextInt();
                if(number[i][j] > max) {
                    max = number[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }


        System.out.println(max);
        System.out.print(maxi + 1 + " ");
        System.out.print(maxj + 1);
    }
}