package baekjoon;

import java.util.*;

public class N2587 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Arrays.sort(arr);
		// 선택 정렬
		for(int i = 0; i < 5; i++) {
			int min_index = i;
			for(int j = i + 1; j < 5; j++) {
				if(arr[min_index] > arr[j]) min_index = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		
		// 평균값 구하기
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += arr[i];
		}
		int avg = sum / 5;
		System.out.println(avg);
		
		
		// 중앙값 구하기
		System.out.println(arr[2]);
	}
}