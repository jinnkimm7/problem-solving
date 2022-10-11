package baekjoon;

import java.util.*;

public class N1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 주어진 수의 개수
		int[] numbers = new int[N]; // 주어진 수
		for(int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int count = 0; // 주어진 수 중 소수의 개수
		
		// 소수 찾기
		for(int i = 0; i < N; i++) {
			int number = numbers[i];
			
			if(number == 1) continue; // 1은 소수가 아니다.
			
			// 2 ~ number - 1 사이에 약수가 없으면 소수이다.
			int divisor = 0;
			for(int j = 2; j < number; j++) {
				if(number % j == 0) divisor++;
			}
			
			if(divisor == 0) count++;
		}
		System.out.println(count);
	}
}