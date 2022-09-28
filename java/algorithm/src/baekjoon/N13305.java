package baekjoon;

import java.util.*;

public class N13305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 도시의 개수
		long[] distance = new long[N - 1]; // 도시간 거리
		for(int i = 0; i < N - 1; i++) {
			distance[i] = sc.nextLong();
		}
		long[] cost = new long[N]; // 비용(유가)
		for(int i = 0; i < N; i++) {
			cost[i] = sc.nextLong();
		}
		
		long answer = 0;
		
		// 이전까지의 최소 비용(유가)
		long minCost = cost[0];
		
		for(int i = 0; i < N - 1; i++) {
			// 현재 비용이 이전 비용보다 적으면, minCost를 갱신해준다.
			if(minCost > cost[i]) {
				minCost = cost[i];
			}
			answer += (minCost * distance[i]);
		}
		System.out.println(answer);
	}
}