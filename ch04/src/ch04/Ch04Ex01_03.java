package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		
		if(20>a) System.out.printf("%d years later",20-a);
		else System.out.print("adult");
	}
}
