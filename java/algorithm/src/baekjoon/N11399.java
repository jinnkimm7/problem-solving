package baekjoon;

import java.util.*;

public class N11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 사람의 수
		int[] time = new int[N]; // 인출 시간
		for(int i = 0; i < N; i++) {
			time[i] = sc.nextInt();
		}
		
		Arrays.sort(time);
				
		int answer = 0;
		int waiting = 0; // 대기 시간
		
		for(int i = 0; i < N; i++) {
			waiting += time[i];
			answer += waiting;
		}
		
		System.out.println(answer);
	}
}