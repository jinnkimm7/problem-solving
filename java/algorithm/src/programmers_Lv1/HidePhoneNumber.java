package programmers_Lv1;

import java.util.*;

public class HidePhoneNumber {
	
    public String solution(String phone_number) {
    	StringBuffer answer = new StringBuffer(phone_number);
		
    	for(int i = 0; i < answer.length() - 4; i++) {
    		answer.setCharAt(i, '*');
    	}
    	return answer.toString();
    }
//   StringBuffer는 String 클래스와 달리 내용을 변경할 수 있다.
    
//  Test code
	public static void main(String[] args) {
		HidePhoneNumber test = new HidePhoneNumber();
		System.out.println(test.solution("01023529367"));
		System.out.println(test.solution("01023524333"));
		System.out.println(test.solution("01033334444"));
	}
}
