package algorithm;

import java.util.*;

public class Greedy2 {

	public static void main(String[] args) {		
//		N, K를 공백을 기준으로 구분하여 입력받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
	
		int answer = 0;
		
//		N이 1이면 반복문 종료
		while(N != 1) {
			if(N % K == 0) {
				N /= K;
				answer++;
			} else {
				N -= 1;
				answer++;
			}
		}
		System.out.println(answer);
	}
}
