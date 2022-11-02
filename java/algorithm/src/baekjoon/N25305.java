package baekjoon;

import java.util.*;

public class N25305 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int k = sc.nextInt();
//		
//		int[] arr = new int[N];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		Arrays.sort(arr);
//		
//		System.out.println(arr[arr.length - k]);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 응시자 수
		int k = sc.nextInt(); // 상 받는 사람 수
		int[] mark = new int[N]; // 학생들의 점수
		
		for(int i = 0; i < N; i++) {
			mark[i] = sc.nextInt();
		}
		
		// 오름차순 선택정렬
		for(int i = 0; i < N; i++) {
			int max_index = i;
			for(int j = i + 1; j < N; j++) {
				if(mark[j] > mark[max_index]) max_index = j;
			}
			
			int temp = mark[i];
			mark[i] = mark[max_index];
			mark[max_index] = temp;
		}
		
		System.out.println(mark[k - 1]);
	}
}