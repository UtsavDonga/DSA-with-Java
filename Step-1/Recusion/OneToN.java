import java.util.Scanner;

public class OneToN {
    static void PrintOnetoN(int i ,int num){
        while (i > num) {
            return ;
        }
        System.out.println(i);
        PrintOnetoN(++i , num);
        
    }
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to print");
        num = sc.nextInt();
        PrintOnetoN(1 , num);
    }
}
