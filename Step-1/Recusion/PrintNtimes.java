import java.util.Scanner;

public class PrintNtimes {

    static int cnt = 0;
    static void print(int num){
        
         if(cnt == num ) return;
         System.out.println(cnt);
         cnt = cnt+1;
         print(num);

    }
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        num = sc.nextInt();
        print(num);
    }
}