package programmers_Lv1;

import java.util.*;

public class ReverseTernary {
    public int solution(int n) {
        int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
//		10진법 -> 3진법(역순)
		while(true) {
			if(n < 3) {
				list.add(n);
				break;
			}
			list.add(n % 3);
			n /= 3;
		}
		
//		3진법(역순) -> 10진법
		for(int i = 0; i < list.size(); i++) {
			answer += (Math.pow(3, list.size() - 1 - i) * list.get(i));
		}
		
		return answer;
    }
	
//    Test code
	public static void main(String[] args) {
		ReverseTernary s = new ReverseTernary();
		System.out.println(s.solution(45));
		System.out.println(s.solution(125));
	}
}
