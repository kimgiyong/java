package ch2;

import java.util.Scanner;

public class Ch02Ex02_07 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("height = ");
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		
		System.out.printf("Your height is %dcm",a);
		
	}
}
