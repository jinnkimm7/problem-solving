package baekjoon;

import java.util.*;

public class N1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(arithmetic_sequence(N));
	}
	
	public static int arithmetic_sequence(int num) {
		int count = 0;
		
		if(num < 100) return num;
		else {
			count = 99;
			for(int i = 100; i <= num ; i++) {
				int hun = i / 100; // 백의 자리 수
				int ten = (i / 10) % 10; // 십의 자리 수
				int one = i % 10; // 일의 자리 수
				
				if((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}
		return count;
	}
}