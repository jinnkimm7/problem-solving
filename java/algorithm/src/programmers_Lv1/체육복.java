package programmers_Lv1;

import java.util.*;

public class 체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		// 여벌 체육복이 있는 학생이 도난당했을 경우
		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					answer++;
					reserve[j] = -1;
					lost[i] = -1;
					break;
				}
			}
		}
		
		// 도난 당한 학생에게 체육복을 빌려주는 경우
		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reserve.length; j++) {
				if(reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}
		return answer;
	}
}