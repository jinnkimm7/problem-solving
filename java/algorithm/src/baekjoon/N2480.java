package baekjoon;

import java.util.*;

public class N2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int prize = 0;
		
		if(a == b && b == c && a == c) { // 3개가 같은 경우
			prize = 10000 + (a * 1000);
		} else if (a == b || a == c) { // 2개가 같은 경우
			prize = 1000 + (a * 100);
		} else if (b == c) { 
			prize = 1000 + (b * 100);
		} else { // 셋다 다른 경우
//			prize = Math.max(a, Math.max(b, c))* 100;
			prize = (a > b ? a : b)* 100;
		}
		
		System.out.println(prize);
	}
}
