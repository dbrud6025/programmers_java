import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int a=0;a<M;a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for(int b=i; b<=j; b++) {
				arr[b-1] = k;
			}
		}
//		System.out.println(Arrays.toString(arr));
		for(int in =0; in <arr.length; in++) {
			if(in == arr.length-1) {
				System.out.print(arr[in]);
				break;
			}
//			else{
				System.out.print(arr[in] + " ");
//			}
			
		}
	}
}