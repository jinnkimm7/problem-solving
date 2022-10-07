package baekjoon;

public class N4673 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];	
		
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
				
		for(int i = 1; i < 10001; i++) {
			if(!check[i]) { // false인 인덱스 => self number
				System.out.println(i);
			}
		}
	}
	
	public static int d(int N) {
		int sum = 0;
		
		sum += N;
		while(N != 0) {
			sum += N % 10;
			N = N / 10; 
		}
		return sum;
	}
}