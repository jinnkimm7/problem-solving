package programmers_Lv1;

public class CalculateShortMoney {
    public long solution(int price, int money, int count) {
    	long result = 0;
        long totalPrice = 0;
        for(int i = 0; i < count; i++) {
        	totalPrice += price * (i + 1);
        }
        
        long answer = totalPrice - money;
        return totalPrice > money ? answer : 0;
    }
    
	public static void main(String[] args) {
		CalculateShortMoney s = new CalculateShortMoney();
		System.out.println(s.solution(3, 20, 4));
	}
}
