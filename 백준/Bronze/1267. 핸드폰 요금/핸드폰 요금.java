import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        int y = 0;
        int sec = 0;

        // 지난달 통화의 개수
        for (int i = 0; i < n; i++) {
            sec = sc.nextInt();
            y += ((sec / 30) + 1) * 10;
            m += ((sec / 60) + 1) * 15;
        }

        if (m == y) {
            System.out.println("Y M " + y);
        } else if (m < y) {
            System.out.println("M " + m);
        } else if (m > y) {
            System.out.println("Y " + y);
        }

    }

 }