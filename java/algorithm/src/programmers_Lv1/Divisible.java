package programmers_Lv1;

import java.util.*;

public class Divisible {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
    	ArrayList<Integer> answer = new ArrayList<>();
    	
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] % divisor == 0) answer.add(arr[i]);
    	}
    	
    	if(answer.isEmpty()) answer.add(-1);
    	
    	Collections.sort(answer);
    	
        return answer;
    }
    
	public static void main(String[] args) {
		Divisible s = new Divisible();
		System.out.println(s.solution(new int[] {5,9,7,10}, 5));
	}

}
