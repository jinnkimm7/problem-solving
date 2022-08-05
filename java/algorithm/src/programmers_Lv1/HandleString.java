package programmers_Lv1;

public class HandleString {
    public boolean solution(String s) {
    	boolean answer = true;
    	if(s.length() == 4 || s.length() ==6) {
    		try {
    			int i = Integer.parseInt(s);
    			return true;
    		} catch(NumberFormatException e) {
    			return false;
    		}
    	} else
    		return false;
    }
    
//    Test code
	public static void main(String[] args) {
		HandleString s = new HandleString();
		System.out.println(s.solution("a234"));
		System.out.println(s.solution("1234"));
	}
}
