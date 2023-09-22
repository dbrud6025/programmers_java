import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int yes = 0;
		if(a-b ==0 && a-c==0 && b-c==0) {
			yes = 10000 + a * 1000;
		}else if (a-b == 0 || a-c ==0) {
			yes = 1000 + a * 100;
		}else if (b-c ==0) {
			yes = 1000 + b * 100;
		}else {
			LinkedList<Integer> list1 = new LinkedList<Integer>();

		    list1.add(a);

		    list1.add(b);

		    list1.add(c);

		    Integer i = Collections.max(list1);
		    
		    yes = i * 100;
		}
		System.out.println(yes);

	}

}