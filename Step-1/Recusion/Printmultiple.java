import java.util.Scanner;

public class Printmultiple {
    static void PrintNtimes(String word , int count){
        if (count == 0) {
            return;
        }
        System.out.println(word);
        PrintNtimes(word, --count);
    }
    public static void main(String[] args) {
        int count ; 
        String word ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Count");
        count = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a word");
        word = sc.nextLine();
        PrintNtimes(word , count);
    }
}