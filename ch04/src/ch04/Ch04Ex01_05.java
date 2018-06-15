package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String[] gate = first.nextLine().split(" ");
		double a = Double.parseDouble(gate[0]);
		double b = Double.parseDouble(gate[1]);
		
		if(a>=4.0&&b>=4.0) System.out.print("A");
		else if(a>=3.0&&b>=3.0) System.out.print("B");
		else System.out.print("C");
	}
}
