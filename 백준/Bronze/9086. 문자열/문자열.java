import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.nextLine();
        }

        for(int i = 0; i < n; i++){
            if(str[i].length() == 1){
                System.out.println(str[i] + str[i]);
            }else if(str[i].length() > 1){
                String[] str2 = new String[str[i].length()];
                str2 = str[i].split("");
                System.out.println(str2[0] + str2[str2.length-1]);
            }
        }
    }
}