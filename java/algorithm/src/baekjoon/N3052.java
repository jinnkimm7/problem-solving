package baekjoon;

import java.util.*;

public class N3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < 10; i++) {
			nums[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			set.add(nums[i] % 42); 
		}
		
		System.out.println(set.size());		
	}
}