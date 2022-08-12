package programmers_Lv1;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++) {
        	if(d[i] <= budget) {
        		budget -= d[i];
        		answer++;
        	} else {
        		break;
        	}
        }
       
        return answer;
    }
    
//    Test code
	public static void main(String[] args) {
		Budget s = new Budget();
		System.out.println(s.solution(new int[] {1,3,2,5,4}, 9));
		System.out.println(s.solution(new int[] {2,2,3,3}, 10));
	}
}