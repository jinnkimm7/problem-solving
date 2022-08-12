package programmers_Lv1;

public class SumPlusMinus {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
       
        for(int i = 0; i < absolutes.length; i++) {
        	if(signs[i]) answer += absolutes[i];
        	else answer -= absolutes[i];
        }
        
        return answer;
    }
    
//    Test code
	public static void main(String[] args) {
		SumPlusMinus s = new SumPlusMinus();
		System.out.println(s.solution(new int[] {4,7,12}, new boolean[] {true,false,true}));
		System.out.println(s.solution(new int[] {1,2,3}, new boolean[] {false,false,true}));
	}
}
