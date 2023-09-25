import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stu = new int[30];
		int[] arr = new int[28];
		
		for(int i = 0; i < 30; i++) {
			stu[i] = i + 1; 
		}
		
		for(int i = 0 ; i < 28; i++) {
			arr[i]= sc.nextInt(); 
		}
		
		for(int i = 0; i <28; i++) {
			for(int j = 0; j < 30; j++) {
				if(arr[i] == stu[j]) {
					stu[j] = 0; 
				}
			}
		}
		int[] answer = new int[2];
		for(int i = 0; i < 30; i++) {
			if(stu[i] != 0) {
				answer[0] = stu[i];
				System.out.println(answer[0]);
			}
		}
	}
}
