import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			Stack<String> stack = new Stack<>();
			String s = br.readLine();
			String answer = "YES";
			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '(')
					stack.push("(");
				else if (s.charAt(j) == ')') {
					if (stack.empty()) {
						answer = "NO";
						break;
					}
					stack.pop();
				}
			}
			if (!stack.empty()) answer = "NO";
			bw.write(answer + "\n");
		}
		bw.flush();

	}
}