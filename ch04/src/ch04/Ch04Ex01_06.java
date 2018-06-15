package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String[] gate = first.nextLine().split(" ");
		char a = gate[0].charAt(0);
		int b = Integer.parseInt(gate[1]);
		
		if(a=='M'&&b>=18) System.out.print("MAN");
		else if(a=='M'&&b<18) System.out.print("BOY");
		else if(a=='F'&&b>=18) System.out.print("WOMAN");
		else System.out.print("GIRL");
	}
}
