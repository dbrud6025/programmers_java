import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[10];
       int cnt = 0;

       for(int i = 0; i < 10; i++) {
           arr[i] = sc.nextInt();
       }

       int[] arr2 = new int[10];
       for(int i = 0; i < 10; i++){
           arr2[i] = arr[i]%42;
       }
       Arrays.sort(arr2);
       for(int i = 0; i < 9; i++) {
           if (arr2[i] == arr2[i+1]) {
               cnt++;
           }
       }
        System.out.println(10-cnt);
    }
}