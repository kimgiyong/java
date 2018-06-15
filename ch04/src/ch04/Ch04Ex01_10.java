package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String[] gate = first.nextLine().split(" ");
		int a = Integer.parseInt(gate[0]);
		int b = Integer.parseInt(gate[1]);
		
		if(a>=b) System.out.print(a-b);
		else System.out.print(b-a);
	}
}
