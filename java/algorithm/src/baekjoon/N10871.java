package baekjoon;

import java.util.*;

public class N10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x = sc.nextInt();

		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			if(x > A[i]) System.out.println(A[i]);
		}
	}
}