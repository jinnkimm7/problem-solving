package programmers_Lv1;

import java.util.*;

public class RemoveDuplication {
    public ArrayList<Integer> solution(int []arr) {
//    	return할 배열의 크기를 알 수 없기 때문에 ArrayLis를 선언했다.
        ArrayList<Integer> answer = new ArrayList<>();

        int temp = -1; // 0~9와 겹치지 않는 숫자 -1를 변수로 만든다.
        for(int i = 0; i < arr.length; i++) {
        	if(temp != arr[i]) answer.add(arr[i]);
        	temp = arr[i];
        }
             
        return answer;
    }
	
//    Test code
	public static void main(String[] args) {
		RemoveDuplication s = new RemoveDuplication();
		System.out.println(s.solution(new int[]{1,1,3,3,0,1,1}));
		System.out.println(s.solution(new int[]{4,4,4,3,3}));
	}
}