/*
*이 i개만큼 양 끝에 가운데에는 2n - 2i개만큼의 스페이스 존재
n = 5:
*        *
**      **
***    ***
****  ****
**********
새로운 이중 for - loop 문 생성
바깥 for-loop에서는 i가 n-1에서 시작, i = 1이 되면 멈춤
별이 i개만큼이 양 끝에, 가운데에는 2n - 2i개만큼의 스페이스 존재
이게 왜 브3 너무 어려엉
*/
import java.io.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            for (int j = 1; j <= 2*n-2*i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            for (int j = 1; j <= 2*n-2*i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}