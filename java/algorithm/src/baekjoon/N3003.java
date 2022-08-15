package baekjoon;

import java.util.*;

public class N3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] count = new int[6];
		int[] full = {1,1,2,2,2,8};
		
		for(int i = 0; i < count.length; i++) {
			count[i] = sc.nextInt();
		}
		
		for(int i = 0; i < full.length; i++) {
			count[i] = full[i] - count[i];
			System.out.println(count[i]);
		}
	}
}
