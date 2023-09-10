import java.io.*;
import java.util.StringTokenizer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int s1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());
           
            LocalTime t1 = LocalTime.of(h1, m1, s1);
            LocalTime t2 = LocalTime.of(h2, m2, s2);
            //ocalTime을 이용하여 시간을 설정
            //LocalTime은 로컬 시간 자바 클래스로 시간 정보만 필요할 때 주로 사용
            long s = ChronoUnit.SECONDS.between(t1, t2);
           //두 날짜 사이의 간격을 나타낼때는 Period를 사용
            long h = s/3600;
            s -= h*3600;
            long m = s/60;
            s-= m*60;
            
            System.out.printf("%d %d %d %n",h,m,s);

        }
    }
}