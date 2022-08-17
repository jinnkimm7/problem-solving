package baekjoon;

import java.util.*;

public class N2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
//		1. repeat 메서드로 풀기
		for(int i = n; i >= 1; i--) {
			System.out.println(" ".repeat(i - 1) + "*".repeat(n - i + 1));
		}
	}
}