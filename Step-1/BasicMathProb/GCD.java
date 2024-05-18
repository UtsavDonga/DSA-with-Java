import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1 and num2");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int gcd = 1;

        for (int i = 1; i < Math.min(num2, num1); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}

// while (num1 > 0 && num2 > 0) {
// if (num1>num2) {
// num1 %= num2 ;
// }
// else{
// num2 %= num1 ;
// }
// }
// if (num1 == 0) {
// System.err.println(num1);
// }
// System.err.println(num2);