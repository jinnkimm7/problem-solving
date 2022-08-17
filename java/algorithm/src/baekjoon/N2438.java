package baekjoon;

import java.util.*;

public class N2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		첫번째 내 풀이 : repeat 메서드 사용
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println("*".repeat(i));
//		}
		
//		두번째 풀이
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}