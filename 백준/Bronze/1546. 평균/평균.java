import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       int[] test = new int[n];
       for(int i = 0; i < n; i++){
           test[i] = sc.nextInt();
       }
       Arrays.sort(test);
       int m = test[n-1];

       double sum = 0;
       for(int i = 0; i < n; i++){
           sum += test[i];
       }

        System.out.println(sum / m * 100 / n * 1.0);
    }
}