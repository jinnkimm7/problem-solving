package programmers_Lv1;

import java.util.*;

public class AddDigits {
    public int solution(int n) {
//    	int를 int[]로 변환
    	String temp = Integer.toString(n);
    	int[] numArr = new int[temp.length()];
    	for(int i = 0; i < temp.length(); i++) {
    		numArr[i] = temp.charAt(i) - '0';
    	}
//    	answer에 모든 index값 더하기
    	int answer = 0;
    	for(int i = 0; i < numArr.length; i++) {
    		answer += numArr[i];
    	}
    	
        return answer;
    }
    
//    Test code
	public static void main(String[] args) {
		AddDigits s = new AddDigits();
		System.out.println(s.solution(12345));
		System.out.println(s.solution(123));
		System.out.println(s.solution(987));
	}
}