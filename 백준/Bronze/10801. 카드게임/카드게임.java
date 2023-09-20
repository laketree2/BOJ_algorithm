import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            B[i] = scanner.nextInt();
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                a++;
            } else if (A[i] < B[i]) {
                b++;
            }
        }
        if (a > b) {
            System.out.println("A");
        } else if (a < b) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }
    }
}