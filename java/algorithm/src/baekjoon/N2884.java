package baekjoon;

import java.util.*;

public class N2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			h--;
			m = 60 + (m - 45);
			if(h < 0) h = 23;
			System.out.println(h + " " + m);
		} else {
			System.out.println(h + " " + (m - 45));
		}
 	}
}