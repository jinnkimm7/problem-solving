package baekjoon;

import java.util.*;

public class N11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] coin = new int[N];
		
		for(int i = 0; i < N; i++) {
			coin[i] = sc.nextInt();
		}
				
		int answer = 0; 
		
		for(int i = N - 1; i >= 0; i--) {//			System.out.println(i);
			answer += K / coin[i];
			K = K % coin[i];
		}

//		int index = N - 1;
//		while(K != 0) {
//			answer += K / coin[index];
//			K = K % coin[index];
//			index--;
//		}
		
		System.out.println(answer);
	}
}