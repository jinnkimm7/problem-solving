package programmers_Lv1;

import java.util.*;

public class MakeReservedArray {
    public int[] solution(long n) {
    	String str = String.valueOf(n);
    	char[] charArr = str.toCharArray();
    	int[] answer = new int[str.length()];
    	
    	for(int i = str.length() - 1; i >= 0; i--) { // 뒤집어서 입력
    		answer[str.length() - 1 - i] = str.charAt(i) - '0';
    	}
    	
    	return answer;
    }
    
	public static void main(String[] args) {
		MakeReservedArray s = new MakeReservedArray();
		System.out.println(Arrays.toString(s.solution(12345)));
	}
}
