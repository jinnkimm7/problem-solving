package programmers_Lv1;

public class SumAtoB {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
        	int temp = 0;
        	temp = a;
        	a = b;
        	b = temp;
        }
        
        for(long i = a; i <= b; i++) {
        	answer += i;
        }
        
        return answer;
    }
    
//    Test code
	public static void main(String[] args) {
		SumAtoB s = new SumAtoB();
		System.out.println(s.solution(3, 5));
		System.out.println(s.solution(3, 3));
		System.out.println(s.solution(5, 3));
	}
}
