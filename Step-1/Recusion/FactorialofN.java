import java.util.Scanner;

public class FactorialofN {
    public int PrintFactofN(int num){
        if (num==0) {
            return 1 ;
        }
        
        return num * PrintFactofN(num-1);
    }
    public static void main(String[] args) {
        FactorialofN fn = new FactorialofN();
        int num ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number");
        num = sc.nextInt();

        if (num < 0 ) {
            System.out.println("Factorial is not define for " +num );
        }
        else{
            int result = fn.PrintFactofN(num);
            System.out.println("Factorial of " + num + " is " + result);
        }

    }
}
