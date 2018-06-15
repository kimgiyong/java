package ch04;

import java.util.Scanner;

public class Ch04Ex01_12 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		
		if(a%4==0&&a%100!=00||a%400==0) System.out.print("leap year");
		else System.out.print("common year");
	}
}
