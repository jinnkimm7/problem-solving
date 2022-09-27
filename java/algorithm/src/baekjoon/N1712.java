package baekjoon;

import java.util.*;

public class N1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // 고정비용
		int B = sc.nextInt(); // 가변비용
		int C = sc.nextInt(); // 판매가격
		
		int answer = 0;
		
		if(B >= C) {
			answer = -1;
		} else {
			answer = A / (C - B) + 1;
		}
		
		System.out.println(answer);
//		시간초과
//		int answer = 0;
//		while(A >= (C - B) * answer) {
//			answer++;
//		}
//		System.out.println(answer > 0 ? answer : -1);
	}
}