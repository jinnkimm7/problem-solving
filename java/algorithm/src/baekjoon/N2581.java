package baekjoon;

import java.util.*;

public class N2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		List<Integer> primes = new ArrayList<>();
		
		for(int i = M; i <= N; i++) {
			int divisor = 0;

			if(i == 1) continue;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) divisor++;
			}
			
			if(divisor == 0) primes.add(i);
		}
		
		int sum = 0;
		for(int i = 0; i < primes.size(); i++) {
			sum += primes.get(i);
		}
		
		if(primes.size() == 0) {
			System.out.println(-1);
		} else {
			int min = primes.get(0);
			System.out.println(sum);
			System.out.println(min);
		}
	}
}