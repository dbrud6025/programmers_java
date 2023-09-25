import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = -1;
		int idx = 0;
		
		int i = 0;
		for(i = 0; i < 9; i++) {
			arr[i]= sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		
		System.out.println(max);
		System.out.println(idx+1);
		
	}
}