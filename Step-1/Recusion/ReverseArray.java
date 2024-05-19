import java.util.Scanner;

public class ReverseArray {
    public static void revearray(int array[]) {
        int n = array.length;
        int p1 = 0, p2 = n - 1;
        while (p1 < p2) {
            int temp = array[p1];
            array[p1] = array[p2];
            array[p2] = temp;
            p1++;
            p2--;
        }
    }

    public static void approachtwo(int array[], int sarat, int end) {
        if (sarat < end) {
            int temp = array[sarat];
            array[end] = array[sarat];
            array[sarat] = temp;
            approachtwo(array, sarat + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        int size;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Size of array");
        size = sc.nextInt();

        System.out.println("Enter a element of array");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // First aPproach
        revearray(array);

        System.out.println("Revere Array");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

}
