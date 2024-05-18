import java.util.Scanner;

public class AramstrongNo {
    public static void main(String[] args) {

        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        num = sc.nextInt();

        int size = String.valueOf(num).length();

        int sum = 0 ;
        int temp = num ;
        while (temp > 0) {
            int digit = temp % 10 ;
            sum += Math.pow(digit, size);
            temp /= 10 ;
        }

        if (sum == num) {
            System.out.println("Number " + num + " is Pelindrom");
        }
        else{
            System.out.println("Number " + num + " is not Pelindrom");
        }
    }
}
