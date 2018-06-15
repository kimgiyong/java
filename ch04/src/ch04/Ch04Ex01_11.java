package ch04;

import java.util.Scanner;

public class Ch04Ex01_11 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		
		if(a>0) System.out.print("plus");
		else if(a<0) System.out.print("minus");
		else System.out.print("zero");
	}
}
