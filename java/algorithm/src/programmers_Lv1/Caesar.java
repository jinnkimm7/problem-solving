package programmers_Lv1;

public class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//             소문자
            if(Character.isLowerCase(ch)) {
                ch = (char)((ch - 'a' + n) % 26 + 'a');
            }
//             대문자
            else if(Character.isUpperCase(ch)) {
                ch = (char)((ch - 'A' + n) % 26 + 'A');
            }
            answer += ch;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("AB", 1));
		System.out.println(s.solution("z", 1));
		System.out.println(s.solution("a B z", 1));
	}

}
