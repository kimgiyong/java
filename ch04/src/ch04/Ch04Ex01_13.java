package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		
		switch(a) {
			case 1: System.out.print("dog"); break;
			case 2: System.out.print("cat"); break;
			case 3: System.out.print("chick"); break;
			default : System.out.print("I don't know");
		}
	}
}
