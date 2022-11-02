package baekjoon;

import java.util.*;

public class N1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		char[] arr = N.toCharArray();
		Arrays.sort(arr);
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		
		// counting 정렬로 풀어보기
//		Scanner sc = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//		
//		int N = sc.nextInt();
//		
//		int[] counting = new int[10]; 
//		
//		while(N != 0) {
//			counting[N % 10] += 1;
//			N /= 10;
//		}
//	
////		System.out.println(Arrays.toString(counting));
//		
//		for(int i = 9; i >= 0; i--) {
//			for(int j = 0; j < counting[i]; j++) {
//				sb.append(i);
//			}
//		}
//		System.out.println(sb);
//	}
	}
}