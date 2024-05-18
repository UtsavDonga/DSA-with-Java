import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        num = sc.nextInt();

        int Count = 0;
        while (num != 0) {
            num = num/10;
            Count++;
        }

        //using log we can count the digits as shown below
        // int cnt = (int) (Math.log10(num) + 1);
        System.out.println(Count+" count");

    }    
}

