import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int c = 0; c < n; c++) {
            arr[c] = c+1;
        }

        for(int a = 0; a < m; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int tmp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = tmp;

        }

        for(int d : arr) {
            if(d == arr[n-1]){
                System.out.println(d);
            }else System.out.print(d + " ");
        }
    }
}