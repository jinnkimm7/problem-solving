package programmers_Lv1;

public class StrToInt {
    public int solution(String s) {
        int answer = Integer.valueOf(s);
        return answer;
    }
    
	public static void main(String[] args) {
		StrToInt s = new StrToInt();
		System.out.println(s.solution("1234"));
		System.out.println(s.solution("-1234"));
	}
}
