package programmers_Lv1;

import java.util.*;

public class ReverseInt {
    public long solution(long n) {
    	String[] strArr = String.valueOf(n).split("");
    	Arrays.sort(strArr);
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < strArr.length; i++) {
    		sb.append(strArr[i]);
    	}
    	
        return Long.parseLong(sb.reverse().toString());
    }
	
//    Test code
	public static void main(String[] args) {
		ReverseInt s = new ReverseInt();
		System.out.println(s.solution(1234));
		System.out.println(s.solution(118372));
	}
}