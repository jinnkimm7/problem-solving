package baekjoon;

import java.util.*;

public class N18870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] origin = new int[N]; //원래 배열
		int[] sorted = new int[N]; //정렬할 배열
		Map<Integer, Integer> rankingMap = new HashMap<>();
		
 		for(int i = 0; i < N; i++) {
			origin[i] = sorted[i] = sc.nextInt();
		}
		
 		Arrays.sort(sorted);
		
 		int rank = 0;
 		for(int v : sorted) {
 			if(!rankingMap.containsKey(v)) {
 				rankingMap.put(v, rank);
 				rank++;
 			}
 		}
 		
 		StringBuilder sb = new StringBuilder();
 		
 		for(int i = 0; i < N; i++) {
 			sb.append(rankingMap.get(origin[i])).append(" ");
 		}
 		
 		System.out.println(sb);
	}
}