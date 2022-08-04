package programmers_Lv1;

import java.util.Arrays;

public class FindKim {
    public String solution(String[] seoul) {
    	int idx = Arrays.asList(seoul).indexOf("Kim");
    	return "김서방은 " + idx + "에 있다";
    }
	public static void main(String[] args) {
		FindKim s = new FindKim();
		System.out.println(s.solution(new String[] {"Jane", "Kim"}));
	}
}
