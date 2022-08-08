package programmers_Lv1;

public class SumDivisor {
    public int solution(int n) {
//        int answer = 0;
//        
//        int[] intArr = new int[n];
//        for(int i = 0; i < n; i++) {
//        	intArr[i] = i + 1;
//        }
//        
//        for(int i = 0; i < intArr.length; i++) {
//        	if(n % intArr[i] == 0) answer += intArr[i];
//        }
//        
//        return answer;
    	int answer = 0;
    	
    	for(int i = 1; i <= n; i++) {
    		if(n % i == 0) answer += i;
    	}
    	
    	return answer;
    }
    
//    Test code
	public static void main(String[] args) {
		SumDivisor s = new SumDivisor();
		System.out.println(s.solution(12));
		System.out.println(s.solution(5));
	}
}
