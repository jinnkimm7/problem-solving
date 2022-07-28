package programmers_Lv1;

import java.util.*;

public class X만큼간격이있는n개의숫자 {
	  public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        for(int i = 0; i < n; i++) {
	        	answer[i] = (long)x * (i + 1);
//	        	long으로 형변환이 필요하다.
	        }
	        return answer;
	    }
}
