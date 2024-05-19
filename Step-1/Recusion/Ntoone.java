import java.util.Scanner;

public class Ntoone {
    static int sum = 0 ;
    static void PrintNtoone(int num){
        for (int i = 1; i < num; i++) {
            sum += i ;
        }
        System.out.println(sum);
    }

    static int  finalapproach(int num){
        if (num==0) {
            return 0 ;
        }
        return  num  + finalapproach(num-1) ; 
    }

    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        num = sc.nextInt();
        
        //simple approach
        PrintNtoone(num);

        //batter aproach
        finalapproach(num);
    }
}
