package programmers_Lv1;

import java.util.*;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        ArrayList<String> participantList = new ArrayList<>(Arrays.asList(participant));
        ArrayList<String> completionList = new ArrayList<>(Arrays.asList(completion));
        
        for(int i = 0; i < completionList.size(); i++) {
        	for(int j = 0; j < participantList.size(); j++) {
        		if(completionList.get(i).equals(participantList.get(j))) participantList.remove(j);
        	}	
        }
        
        System.out.println(participantList.toString());
        answer = participantList.get(0);
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		System.out.println(s.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
		System.out.println(s.solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
		
	}
}
