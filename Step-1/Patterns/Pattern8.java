import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        sc.close();

        int stare = 1 ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < stare ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
            stare += 2;
        }
    }
}
