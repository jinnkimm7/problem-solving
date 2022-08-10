package programmers_Lv1;

import java.util.*;

public class PickNumNadd {
    public int[] solution(int[] numbers) {
        int[] answer = {};
//      중복을 허용하지 않고, 순서에 상관없는 HashSet에 값을 저장한다.
//      * 추가로 알게된 내용 : TreeSet은 중복을 허용하지 않지만 오름차순으로 데이터를 저장한다.
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = 0; j < numbers.length; j++) {
        		if(i == j) continue;
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        
//        ArrayList에 값을 옮겨서 정렬한다.
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
//       int[]에 값을 옮겨 담는다.
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
    
//    Test code
	public static void main(String[] args) {
		PickNumNadd s = new PickNumNadd();
		System.out.println(s.solution(new int[] {2,1,3,4,1}));
		System.out.println(s.solution(new int[] {5,0,2,7}));
	}
}