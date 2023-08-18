import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine(); //문자열을 입력받은 뒤, 정수를 입력
		int n = Integer.parseInt(br.readLine())-1; 
        //charAt()은 0번째 부터 시작하기 때문에 입력받는 정수 n에 -1
		
		br.close();
		
		System.out.println(st.charAt(n)); //chatAt()을 사용하여 문자열의 n번째 문자를 출력
		
		
	}
}