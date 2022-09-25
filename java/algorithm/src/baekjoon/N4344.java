package baekjoon;

import java.util.*;

public class N4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int i = 0; i < C; i++) {
			int N = sc.nextInt(); // 학생
			
			int[] score = new int[N];
			double sum = 0;
			double avg = 0;
			int count = 0; // 평균을 넘는 학생 수
			
			for(int j = 0; j < N; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			
			avg = sum / N;
			
			for(int j = 0; j < N; j++) {
				if(score[j] > avg) count++;
			}
	
			double answer = (double) count / N * 100;
			
			System.out.printf("%.3f", answer);
			System.out.println("%");
		}
	}
}