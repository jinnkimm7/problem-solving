package algorithm;

import java.util.*;

public class Sort1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Integer[] A = new Integer[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		
		Integer[] B = new Integer[N];
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		// 내림차순 정렬 
		Arrays.sort(B, Collections.reverseOrder());
	
		
		for(int i = 0; i < K; i++) {
			if(A[i] < B[i]) {
				int temp = A[i];
				A[i] = B[i];
				B[i] = temp;
			} else break;
		}
		
		int answer = 0;
		for(int i = 0; i < N; i++) {
			answer += A[i];
		}
		System.out.println(answer);
	}
}