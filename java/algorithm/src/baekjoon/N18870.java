package baekjoon;

import java.util.*;

public class N18870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 좌표의 개수
		int[] X = new int[N]; // X좌표
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < N; i++) {
			set.add(X[i]);
		}
		
		int[] location = new int[set.size()]; // 실제 X좌표(중복제거)
		int k = 0;
		for(int i : set) {
			location[k++] = i;
		}

//		System.out.println(Arrays.toString(X));
//		System.out.println(Arrays.toString(location));
		
		int[] answer = new int[N]; // 압축된 좌표
		
		for(int i = 0; i < N; i++) {
			int count = 0;
			for(int j = 0; j < location.length; j++) {
				if(X[i] > location[j]) count++;
			}
			answer[i] = count;
		}
		
//		System.out.println(Arrays.toString(answer));
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}