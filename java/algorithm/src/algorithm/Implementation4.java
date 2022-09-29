package algorithm;

import java.util.*;

public class Implementation4 {
	
//	public static String str;
//	public static ArrayList<Character> result = new ArrayList<>();
//	public static int value = 0;
//	
//	public static void main(String[] args) {
////		문자열 s 입력받기
//		Scanner sc = new Scanner(System.in);
//		str = sc.nextLine();
//
////		문자를 하나씩 확인하며
//		for(int i = 0; i < str.length(); i++) {
////			알파벳인 경우 결과리스트에 삽입
//			if(Character.isLetter(str.charAt(i))) {
//				result.add(str.charAt(i));
//			}
////			숫자는 따로 더하기
//			else {
//				value += str.charAt(i) - '0';
//			}
//		}
//		
////		알파벳을 오름차순으로 정렬
//		Collections.sort(result);
//		
////		알파벳을 차례대로 출력
//		for(int i = 0; i < result.size(); i++) {
//			System.out.print(result.get(i));
//		}
////		숫자가 하나라도 존재하는 경우에는 가장 뒤에 출력
//		if(value != 0) {
//			System.out.print(value);
//		}
//		System.out.println();
//	}
	
//	2번째 풀이
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		int length = S.length();
		
//		알파벳을 따로 담는다.
		char[] alphabets = new char[length];
//		숫자의 합을 따로 더한다.
		int sum = 0;
				
		for(int i = 0; i < length; i++) {
			char temp = S.charAt(i);
			if(65 <= temp && temp <= 90) {
				alphabets[i] = temp;
			} else {
				sum += (temp - '0');
			}
		}
		
		Arrays.sort(alphabets);
		String alphabet = new String(alphabets).trim();
		
		if(sum != 0) {
			System.out.println(alphabet + sum);
		} else {
			System.out.println(alphabet);
		}
	}
}