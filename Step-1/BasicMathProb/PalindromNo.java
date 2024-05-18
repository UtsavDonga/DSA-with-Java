import java.util.Scanner;

public class PalindromNo {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        num = sc.nextInt(); 

        int temp = 0 ;
        int result = num ; 
        while (num != 0) {
            int digit = num % 10 ;
            temp = temp*10 + digit ;
            num /= 10 ;
        } 
        if (temp == result) {
            System.out.println("Number " + result + " is Palindrom");
        }
        else{
            System.out.println("Number " + result + " is Not Palindrom");
        }
    }
}
