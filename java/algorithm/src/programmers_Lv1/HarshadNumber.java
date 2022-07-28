package programmers_Lv1;

import java.util.*;

public class HarshadNumber {
	
    public boolean solution(int x) {
    	
//    	1. int x를 int[]로 만들기. 
    	String s = Integer.toString(x);
    	int[] arr = new int[s.length()];
    	for(int i = 0; i < s.length(); i++) {
//    		char를 int로 변환하기 => char - '0'
    		arr[i] = s.charAt(i) - '0';
    	}

//    	2. sum에 자릿수의 합을 더한다.
    	int sum = 0;
    	for(int i = 0; i < arr.length; i++) {
    		sum += arr[i];
    	}
    	
    	return x % sum == 0 ? true : false;
    }
	
	public static void main(String[] args) {
		HarshadNumber s = new HarshadNumber();
		System.out.println(s.solution(10));
		System.out.println(s.solution(12));
		System.out.println(s.solution(11));
		System.out.println(s.solution(13));
	}
}
