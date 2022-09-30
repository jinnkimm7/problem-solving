package baekjoon;

import java.util.*;

public class N2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 카드의 갯수
		int M = sc.nextInt(); // 딜러가 외친 숫자(타겟 넘버)
		
		int[] card = new int[N];
		
		for(int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}
		
		int answer = search(card, N, M);
		System.out.println(answer);
		
	}
	
	static int search(int[] arr, int N, int M) {
		int result = 0;
		
		for(int i = 0; i < N - 2; i++) {
			for(int j = i + 1; j < N - 1; j++) {
				for(int k = j + 1; k <  N; k++) {
					// 3개 카드합의 변수
					int tmp = arr[i] + arr[j] + arr[k];
					// 세 카드의 합이 딜러가 외친 숫자와 같다면 tmp 리턴
					if(tmp == M) return tmp;
					// 세 카드의 합이 이전보다 크고 딜러가 외친 숫자보다 작으면 result 갱신
					if(result < tmp && tmp < M) result = tmp;
				}
			}
		}
		return result;
	}
}