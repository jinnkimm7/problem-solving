package programmers_Lv1;

public class EvenOrOdd {

    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
	
//    Test code
	public static void main(String[] args) {
		EvenOrOdd test = new EvenOrOdd();
		System.out.println(test.solution(3));
		System.out.println(test.solution(4));
	}
}
