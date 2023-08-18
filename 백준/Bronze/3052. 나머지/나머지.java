import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
HashSet
중복원소 비허용, 순서개념 없음(set파생)
Collections.sort() 메소드를 사용 불가
정렬시 리스트로 변환 후 정렬
*/
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>(); 
        /*
        for (int i = 0; i < 10; i++) {
			h.add(in.nextInt() % 42);
		//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
		}
        HashSet.add(): HashSet에 저장하는 메소드 
        HashSet<Integer> 으로 타입을 Integer로 선언 -> int 형 또는 Integer 객체 사용
        */
		
		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.print(h.size());
	}
}