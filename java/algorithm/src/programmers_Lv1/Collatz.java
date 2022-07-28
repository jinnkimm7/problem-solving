package programmers_Lv1;

public class Collatz {
//	홀 -> 짝 -> 홀 -> 짝 형태를 반복하면 int형이 오버플로우가 발생한다. 
    public int solution(long num) {
    	int count = 0;
    	while(num != 1) {
    		if(num % 2 == 0) {
    			num /= 2;
    		} else {
    			num = num * 3 + 1;
    		}
    		count++;
    	}
		return count > 500 ? -1 : count;
    }
    
	public static void main(String[] args) {
		Collatz s = new Collatz();
		System.out.println(s.solution(6));
		System.out.println(s.solution(16));
		System.out.println(s.solution(626331));
	}

}
