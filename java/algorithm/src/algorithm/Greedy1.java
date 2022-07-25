package algorithm;

public class Greedy1 {
	
	public static void main(String[] args) {
		int n = 1260;
		int[] coinType = {500, 100, 50, 10};
		
		int count = 0;
		
		for(int i = 0; i < coinType.length; i++) {
			count += n / coinType[i];
			n %= coinType[i];
		}
		
		System.out.println(count);
	}
}
