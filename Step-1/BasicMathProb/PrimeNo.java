import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        num = sc.nextInt();

        boolean flag = false ;
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                flag = false ;
            }
            flag = true ;
        }

        if (flag==true) {
            System.out.println("num is prime");
        }
        else{
            System.out.println("num is not prime");
        }
    }
}
