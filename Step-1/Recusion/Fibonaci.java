import java.util.Scanner;

public class Fibonaci {
    public static int PrintFibonaci(int num){
        if (num <= 1) {
            return num ;
        }

        return PrintFibonaci(num-1) + PrintFibonaci(num-2) ;
    }
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        num = sc.nextInt();

        System.out.println(PrintFibonaci(num));

    }
}
