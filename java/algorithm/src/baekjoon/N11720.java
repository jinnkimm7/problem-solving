package baekjoon;

import java.util.*;

public class N11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String str = sc.next();
		int answer = 0;
		for(int i = 0; i < N; i++) {
			answer += str.charAt(i) - '0';
		}
		
		System.out.println(answer);
	}
}