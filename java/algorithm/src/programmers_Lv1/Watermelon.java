package programmers_Lv1;

public class Watermelon {
    public String solution(int n) {
        return "수박".repeat(n).substring(0, n);
    }
    
//    Test code
	public static void main(String[] args) {
		Watermelon s = new Watermelon();
		System.out.println(s.solution(3));
		System.out.println(s.solution(4));
	}
}
