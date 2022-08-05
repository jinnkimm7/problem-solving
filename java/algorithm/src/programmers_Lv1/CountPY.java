package programmers_Lv1;

public class CountPY {
    boolean solution(String s) {
    	String str = s.toLowerCase();

    	int p = 0;
    	int y = 0;
    	
    	for(int i = 0; i < str.length(); i++) {
    		if(str.charAt(i) == 'p') p++;
    		else if(str.charAt(i) == 'y') y++;
    	}
    	
    	return p == y ? true : false;
    }
    
	public static void main(String[] args) {
		CountPY s = new CountPY();
		System.out.println(s.solution("pPoooyY"));
		System.out.println(s.solution("Pyy"));
	}
}
