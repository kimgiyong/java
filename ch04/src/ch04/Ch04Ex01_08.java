package ch04;

import java.util.Scanner;

public class Ch04Ex01_08 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String gate = first.nextLine();
		double a = Double.parseDouble(gate);
		
		switch((int)a) {
			case 4 : System.out.print("scholarship"); break;
			case 3 : System.out.print("next semester"); break;
			case 2 : System.out.print("seasonal semester"); break;
			default : System.out.print("retake");
		}
	}
}
