package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String gate = first.nextLine();
		char a = gate.charAt(0);
		
		switch(a) {
			case 'A': System.out.print("Excellent"); break;
			case 'B': System.out.print("Good"); break;
			case 'C': System.out.print("Usually"); break;
			case 'D': System.out.print("Effort"); break;
			case 'F': System.out.print("Failure"); break;
			default : System.out.print("error"); break;
		}
	}
}
