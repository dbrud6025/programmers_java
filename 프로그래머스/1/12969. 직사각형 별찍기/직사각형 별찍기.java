import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int j = 0; j < b; j++) {
            if(j == b-1) {
                for (int i = 0; i < a; i++) {
                    System.out.print("*");
                }
            }else {
                for (int i = 0; i < a; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        
}
}