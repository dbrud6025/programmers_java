
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		int j = 1;
		String answer = "";
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			for(; j < num+1; j++) {
				stack.push(j);
				sb.append("+").append("\n");
			}
			if(stack.peek() == num) {
				stack.pop();
				sb.append("-").append("\n");
			}else {
				answer = "NO";
				break;
			}
		}
		if(answer.equals("NO")) System.out.println(answer);
		else {
			System.out.println(sb);
		}
	}
}