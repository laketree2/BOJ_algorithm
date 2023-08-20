//1978

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//시간 복잡도 O(N√N)

public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();	// N 은 쓰지 않음.	
		// StringTokenizer 자체가 토큰이 남아있는지 여부를 
		// true, false 로 반환시켜주는 hasMoreTokens() 라는 메소드를 갖고 있기 때문
		
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while(st.hasMoreTokens()) {
        
			// 소수인경우 true, 아닌경우 false   
			boolean isPrime = true;
			
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				continue;
			}
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
			}
		}
		System.out.println(count);
	}
 
}