package baekjoon;

import java.util.*;

class N2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i = 0; i < strArr.length; i++) {
			if(s.contains(strArr[i])) {
				s = s.replace(strArr[i], "0");
			}
		}
	
		System.out.println(s.length());
	}
}