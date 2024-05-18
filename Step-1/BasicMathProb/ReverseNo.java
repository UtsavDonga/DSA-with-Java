import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        num = sc.nextInt();

        int ReverseNo = 0;
        int digit = 0 ;
        while (num!=0) {
            digit = num % 10 ;
            ReverseNo = ReverseNo*10 + digit ;
            num /= 10 ;
        }
        System.out.println(ReverseNo);
    }
}
