package programmers_Lv1;

import java.util.*;

public class RemoveMin {
	
    public int[] solution(int[] arr) {
    	if(arr.length == 1) return new int[]{-1};
    	
    	int minIdx = 0;
    	for(int i = 1; i < arr.length; i++) {
    		if(arr[minIdx] > arr[i]) {
    			minIdx = i;
    		}
    	}
    	
    	int[] answer = new int[arr.length - 1];
    	int count = 0;
    	for(int i = 0; i < arr.length; i++) {
    		if(i == minIdx) continue;
    		answer[count++] = arr[i];
    	}
    	
		return answer;
    }
}