package baekjoon;

import java.util.*;

public class N11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
//		List<Integer> numbers = new ArrayList<>();
//		
//		int i = 2;
//		while(N != 1) {
//			if(N % i == 0) {
//				numbers.add(i);
//				N = N / i;
//			} else {
//				i++;
//			}
//		}
//		
//		Iterator it = numbers.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		int i = 2;
		while(N != 1) {
			if(N % i == 0) {
				System.out.println(i);
				N = N / i;
			} else {
				i++;
			}
		}
	}
}