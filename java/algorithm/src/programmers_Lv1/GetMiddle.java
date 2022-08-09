package programmers_Lv1;

public class GetMiddle {
    public String solution(String s) {
//        String answer = "";
//
//        String[] strArr = s.split("");
//        int strArrLength = strArr.length;
//        if(strArrLength % 2 != 0) {
//        	answer = strArr[strArrLength / 2];
//        } else {
//        	answer = strArr[strArrLength / 2 -1 ] + strArr[strArrLength / 2];
//        }
//
//        return answer;
    	String answer = "";
    	
    	int sLength = s.length();
    	if(sLength % 2 == 0) {
    		answer = s.substring(sLength / 2 - 1, sLength / 2 + 1);
    	} else {
    		answer = s.substring(sLength / 2, sLength / 2 + 1);
    	}
    	
    	return answer; 
    }
    
	public static void main(String[] args) {
		GetMiddle s = new GetMiddle();
		System.out.println(s.solution("abcde"));
		System.out.println(s.solution("qwer"));
	}
}
