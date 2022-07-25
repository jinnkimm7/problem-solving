package algorithm;

import java.util.Scanner;

public class Greedy3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

//		첫 번째 문자를 숫자로 변경한 값을 대입
		int answer = S.charAt(0) - '0';
		
		for(int i = 1; i < S.length();i++) {
//			두 수 중에서 0이나 1이면 더하기 연산, 이 외에는 곱하기 연산 수행.
			int num = S.charAt(i) - '0';
			if(num <= 1 || answer <= 1) {
				answer += num;
			} else {
				answer *= num;
			}
		}
		System.out.println(answer);
	}
}
