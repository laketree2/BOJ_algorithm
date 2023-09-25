import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
            
			for (int k = 0; k < (2 * n - 1) - (2 * i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
         //삼각형
		for (int i = 0; i < n - 1; i++) {	// n+1 ~ 2n-1
			for (int j = 1; j < (n - 1) - i; j++) {	
				System.out.print(" ");
			}

			for (int k = 0; k < 3 + 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
 
}