package ArrayInJava.Exam1;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integer values. ");
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("\nElement %d,typed values was " + A[i], i);
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            j = j + A[i];
        }
        double average = (j/n);
        System.out.format("\nAverage is %.1f ",average);
    }
}
