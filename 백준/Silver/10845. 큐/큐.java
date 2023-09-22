import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int[] que = new int[10001];
	static int first = 0;
	static int rear = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			switch(s) {
			case "push" :
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop" :
				sb.append(pop()).append("\n");
				break;
			case "size" :
				sb.append(size()).append("\n");
				break;
			case "empty" :
				sb.append(empty()).append("\n");
				break;
			case "front" :
				sb.append(front()).append("\n");
				break;
			case "back" :
				sb.append(back()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
	
	public static void push(int x) {
		que[rear] = x;
		rear++;
	}
	
	public static int pop() {
		if(rear - first == 0) {
			return -1;
		}else {
			int p = que[first];
			first++;
			return p;
		}
	}
	
	public static int size() {
		return rear - first;
	}
	
	public static int empty() {
		if(rear - first == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int front() {
		if(rear - first == 0) {
			return -1;
		}else {
			int f = que[first];
			return f;
		}
	}
	
	public static int back() {
		if(rear - first == 0) {
			return -1;
		}else {
			int B = que[rear - 1];
			return B;
		}
	}
	
}