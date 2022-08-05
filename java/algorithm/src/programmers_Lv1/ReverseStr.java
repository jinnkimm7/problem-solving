package programmers_Lv1;

import java.util.*;

public class ReverseStr {
    public String solution(String s) {
    	char[] chars = s.toCharArray();
    	Arrays.sort(chars);
    	
    	StringBuilder sb = new StringBuilder(new String(chars));	

//    	chars뒤집기
//    	for(int i = chars.length -1; i >= 0; i--) {
//    		sb.append(chars[i]);
//    	}
    	
        return sb.reverse().toString();
    }
    
//    TEST CODE
	public static void main(String[] args) {
		ReverseStr s = new ReverseStr();
		System.out.println(s.solution("Zbcdefg"));
	}
}