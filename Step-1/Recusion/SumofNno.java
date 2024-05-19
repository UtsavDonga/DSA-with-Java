import java.util.Scanner;

public class SumofNno {
    static void PrintSumofN(int i, int num) {
        while (i > num) {
            return;
        }
        System.out.println();
        PrintSumofN(++i, num);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        num = sc.nextInt();

        PrintSumofN(1 ,num);
    }
}