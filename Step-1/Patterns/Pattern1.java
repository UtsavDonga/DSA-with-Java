import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        n = sc.nextInt();
        sc.close();

        //logic
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}