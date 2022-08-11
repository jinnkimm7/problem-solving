package programmers_Lv1;

import java.util.*;

public class CountDivisorNsum {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
    		int count = 0;
        	for(int j = 1; j <= i; j++) {
        		if(i % j == 0) count++;
        	}
        	if(count % 2 == 0) answer += i;
        	else answer -= i;
        }
        
        return answer;
    }
    
//    Test code
	public static void main(String[] args) {
		CountDivisorNsum s = new CountDivisorNsum();
		System.out.println(s.solution(13, 17));
		System.out.println(s.solution(24, 27));
	}
}
