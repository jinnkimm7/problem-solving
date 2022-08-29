package baekjoon;

import java.util.*;

public class N1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		char[] arr = N.toCharArray();
		Arrays.sort(arr);
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}