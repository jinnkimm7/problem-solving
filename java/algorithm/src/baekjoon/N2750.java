package baekjoon;

import java.util.*;

public class N2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Arrays.sort(arr);
		// 정렬 알고리즘
		for(int i = 0; i < N; i++) {
			int min_index = i;
			
			for(int j = i + 1; j < N; j++) {
				if(arr[min_index] > arr[j]) {
					min_index = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}
}
