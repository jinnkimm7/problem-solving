package programmers_Lv1;

public class IsSqrt {
    public long solution(long n) {
        Double sqrt = Math.sqrt(n);
        
        if(sqrt == sqrt.intValue()) {
        	return (long)Math.pow(sqrt + 1, 2);
        } else {
        	return -1;
        }
    }
    
    public static void main(String[] args) {
    	IsSqrt s = new IsSqrt();
    	System.out.println(s.solution(121));
    	System.out.println(s.solution(3));
    }
}
