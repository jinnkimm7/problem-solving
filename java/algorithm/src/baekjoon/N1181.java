package baekjoon;

import java.util.*;

public class N1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String[] arr = new String[N];
				
		for(int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
//				길이가 같은 경우 => 사전순
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else { // 그 외의 경우 
					return s1.length() - s2.length();
				}
			}
		});
				
		System.out.println(arr[0]);
		for(int i = 1; i < N; i++) {
			if(!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
	}
}