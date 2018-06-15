package ch04;

import java.util.Scanner;

public class Ch04Ex01_04 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String gate = first.nextLine();
		double a = Double.parseDouble(gate);
		
		if(50.80>=a) System.out.print("Flyweight");
		else if(61.23>=a) System.out.print("Lightweight");
		else if(72.57>=a) System.out.print("Middleweight");
		else if(88.45>=a) System.out.print("Cruiserweight");
		else System.out.print("Heavyweight");
	}
}
