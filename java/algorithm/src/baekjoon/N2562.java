package baekjoon;

import java.util.*;

public class N2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[9];
		int max = nums[0];
		int max_index = 0;
		
		for(int i = 0; i < 9; i++) {
			nums[i] = sc.nextInt();
		}
	
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) { 
				max = nums[i];
				max_index = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(max_index);
	}
}