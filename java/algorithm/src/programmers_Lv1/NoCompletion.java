package programmers_Lv1;

import java.util.*;

public class NoCompletion {
	public String solution(String[] participant, String[] completion) {
//		1. Array로 풀기
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        
//        for(int i = 0; i < completion.length; i++) {
//        	if(participant[i].equals(completion[i])) continue;
//        	else return participant[i];
//        }
//        
//        return participant[participant.length - 1];

//		2. HashMap으로 풀기
		String answer = "";
		
		Map<String, Integer> map = new HashMap<>();
		for(String p : participant) {
			map.put(p, map.getOrDefault(p, 0) + 1);
		}
		
		for(String c : completion) {
			map.put(c, map.get(c) - 1);
		}
		
		for(String key : map.keySet()) {
			if(map.get(key) != 0) {
				answer = key;
				break;
			}
		}
		
		return answer;
    }
	
	public static void main(String[] args) {
		NoCompletion s = new NoCompletion();
		System.out.println(s.solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		System.out.println(s.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
		System.out.println(s.solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
	}
}
