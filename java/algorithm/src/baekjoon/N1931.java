package baekjoon;

import java.util.*;

public class N1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 회의 수
		int[][] time = new int[N][2]; // 회의 시간
		for(int i = 0; i < N; i++) {
			time[i][0] = sc.nextInt(); // 회의 시작 시간
			time[i][1] = sc.nextInt(); // 회의 종료 시간
		}
		
		// 끝나는 시간을 기준으로 정렬
		Arrays.sort(time, new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// 종료시간이 같을 경우 시작시간이 빠른 순으로 정렬
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
			}
		});
				
		int answer = 0;
		int prev_end_time = 0;
		
		for(int i = 0; i < N; i++) {
			// 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
			if(prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}