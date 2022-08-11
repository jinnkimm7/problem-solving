package programmers_Lv1;

import java.util.*;

public class SumNums {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int i = 0; i < numbers.length; i++) {
        	answer -= numbers[i];
        }
        
        return answer;
    }
    
//    Test code
	public static void main(String[] args) {
		SumNums s = new SumNums();
		System.out.println(s.solution(new int[] {1,2,3,4,6,7,8,0}));
		System.out.println(s.solution(new int[] {5,8,4,0,6,7,9}));
	}
}
