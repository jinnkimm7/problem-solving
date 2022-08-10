package programmers_Lv1;

public class FindNum {
    public int solution(int n) {
    	int answer = 0;
        for(int i = 2; i < n; i++) {
        	if(n % i == 1) {
        		answer = i;
        		break;
        	}
        }
        return answer;
    }
    
//    Test code
	public static void main(String[] args) {
		FindNum s = new FindNum();
		System.out.println(s.solution(10));
		System.out.println(s.solution(12));
	}
}
