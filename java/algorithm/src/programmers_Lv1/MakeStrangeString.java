package programmers_Lv1;

import java.util.*;

public class MakeStrangeString {
    public String solution(String s) {
        String answer = "";
    	String[] strArr = s.split("");
    	
    	int idx = 0;
    	for(int i = 0; i < strArr.length; i++) {
/**
 * 	String 형은 == 사용시 null 참조 오류가 발생할 수 있으므로
 	equals로 비교해서 공백을 찾는다.
 */
    		if(strArr[i].equals(" ")) idx = 0;
    		else if(idx % 2 == 0) {
    			strArr[i] = strArr[i].toUpperCase();
    			idx++;
    		}
    		else if(idx % 2 != 0) {
    			strArr[i] = strArr[i].toLowerCase();
    			idx++;
    		}
    		answer += strArr[i];
    	}
        return answer;
    }
    
//  Test Code  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeStrangeString s = new MakeStrangeString();
		System.out.println(s.solution("try hello world"));
	}
}
