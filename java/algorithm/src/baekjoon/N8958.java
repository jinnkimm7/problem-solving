package baekjoon;

import java.util.*;

public class N8958 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String[] arr = new String[sc.nextInt()];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.next();
			}
			
			for(int i = 0; i < arr.length; i++) {
				int sum = 0;
				int count = 0;

				for(int j = 0; j < arr[i].length(); j++) {
					if(arr[i].charAt(j) == 'O') {
						count++;
						sum += count;
					} else {
						count = 0;
					}
				}
				System.out.println(sum);
			}
		}
}