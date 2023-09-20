import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = Integer.parseInt(scanner.nextLine());
        String alpha = "JKLABCDEFGHI";
        String num = "7890123456";
        System.out.println(alpha.charAt((s-1)%12) + "" + num.charAt((s-1)%10));
    }
}