package baekjoon;

import java.util.*;

public class N10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
//		1. 내 풀이 : 정답
//		int min = arr[0];
//		int max = arr[0];
//
//		for(int i = 1; i < arr.length; i++) {
//			if(min > arr[i]) min = arr[i];
//		}
//		
//		for(int i = 1; i < arr.length; i++) {
//			if(max < arr[i]) max = arr[i];
//		}
//		
//		System.out.println(min + " " + max);
		
//		2. Arrays.sort() 메서드 사용
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[arr.length - 1]);
	}
}