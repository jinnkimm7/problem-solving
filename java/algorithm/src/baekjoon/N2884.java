package baekjoon;

import java.util.Scanner;

public class N2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m - 45 < 0) {
			if(h < 0) {
				h = 23;
			} else {
				h = h - 1;				
			}
			m = 60 - (45 - m);
		}
		System.out.println(h + " " + m);
	}
}