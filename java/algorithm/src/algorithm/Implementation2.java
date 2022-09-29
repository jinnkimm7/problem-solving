package algorithm;

import java.util.*;

public class Implementation2 {
////	특정한 시각에 3이 포함되어 있는지의 여부
//	public static boolean check(int h, int m, int s) {
//		if(h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) {
//			return true;
//		}
//		return false;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
////		h입력받기
//		int h = sc.nextInt();
//		int count = 0;
//		for(int i = 0; i <= h; i++) {
//			for (int j = 0; j < 60; j++) {
//				for (int k =0; k < 60; k++) {
////					매 시각 안에 3이 포함되어 있다면 카운트 증가
//					if(check(i,j,k)) count++;
//				}
//			}
//		}
//		System.out.println(count);
//	}
	
//	2번째 풀이
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int answer = 0;
		
		for(int i = 0; i <= N; i++) {
			for(int j = 0; j < 60; j++) {
				for(int k = 0; k < 60; k++) {
					String tmp = "";
					tmp += i;
					tmp += j;
					tmp += k;
					
					if(tmp.contains("3")) answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
