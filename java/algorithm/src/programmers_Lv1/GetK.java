package programmers_Lv1;

import java.util.Arrays;

public class GetK {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
        	int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
        	Arrays.sort(temp);
        	answer[i] = temp[commands[i][2] - 1];
        }
                
        return answer;
    }
    
//    Test Code
	public static void main(String[] args) {
		GetK s = new GetK();
		System.out.println(s.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2,5,3}, {4,4,1}, {1,7,3}}));
	}
}