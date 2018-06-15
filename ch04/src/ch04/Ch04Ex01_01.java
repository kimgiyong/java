package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		System.out.println(a);
		if(a<0) System.out.println("minus");
	}
}
