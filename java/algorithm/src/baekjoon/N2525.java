package baekjoon;

import java.util.*;

public class N2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputHour = sc.nextInt();
		int inputMinute = sc.nextInt();
		int time = sc.nextInt();
		
		int hour = inputHour;
		int minute = inputMinute + time;
		
		while(minute >= 60) {
			hour += 1;
			if(hour == 24) hour = 0;
			minute = minute - 60;
		}
		
		System.out.println(hour + " " + minute);
	}
}
