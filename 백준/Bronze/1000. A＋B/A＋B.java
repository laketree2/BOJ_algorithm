import java.util.Scanner; //scanner 사용을 위해 패키지 수입

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //사용자로부터 키보드로 입력받기
        //객체 생성
        int a = scanner.nextInt(); //enter 입력 전까지 입력받기
        int b = scanner.nextInt(); //next()는 공백 전
        
        System.out.println(a+b);
        
        scanner.close();
        
    }
}