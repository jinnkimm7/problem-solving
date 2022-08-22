package baekjoon;

public class N15596 {
	long sum(int[] a) {
		long result = 0L;

		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		N15596 t = new N15596();
		System.out.println(t.sum(new int[] {1,2,3,4,5}));
	}
}
