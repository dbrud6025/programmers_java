
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
    	
        for(int i =0; i < t; i++) {
        	String sentence = br.readLine();
        	StringBuilder answer = new StringBuilder();
        	String[] words = sentence.split(" ");
        	
        	for(int j = 0; j < words.length; j++) {
        		if(j == words.length - 1) {
        			for(int z = 0; z < words[j].length(); z++) {
        				answer.append(words[j].charAt(words[j].length() - 1 - z)); 
        			}
        		}else {
        			for(int z = 0; z < words[j].length(); z++) {
        				answer.append(words[j].charAt(words[j].length() - 1 - z));
        			}
        			answer.append(" ");
        		}
        	}
        	
        	
        	System.out.println(answer);
        }
        
        
	}

}
