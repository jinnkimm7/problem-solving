package baekjoon;

import java.util.*;

public class N7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 사람의 수
		int[][] size = new int[N][2]; // 몸무게, 키
		
		for(int i = 0; i < N; i++) {
			size[i][0] = sc.nextInt(); // 몸무게
			size[i][1] = sc.nextInt(); // 키
		}
		
		for(int i = 0; i < N; i++) {
			int rank = 1;
			
			for(int j = 0; j < N; j++) {
				// 같은 사람이면 비교할 필요가 없다.
				if(i == j) continue;
				if(size[i][0] < size[j][0] && size[i][1] < size[j][1]) {
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
	}
}