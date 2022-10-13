package baekjoon;

import java.util.*;

public class N10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int H = sc.nextInt(); // 층
			int W = sc.nextInt(); // 호수
			int N = sc.nextInt(); // 몇번째 손님인지
			
			int Y, X = 0; // 층수, 호
			if(N % H == 0) {
				Y = H * 100;
				X = N / H;
			} else {
				Y = (N % H) * 100;
				X = (N / H) + 1;
			}
			
			System.out.println(Y + X);
		}
	}
}