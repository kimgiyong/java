package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String[] gate = first.nextLine().split(" ");
		int a = Integer.parseInt(gate[0]);
		int b = Integer.parseInt(gate[1]);
		
		System.out.println(b+100-a);
		if(b+100-a>0) System.out.print("Obesity");
	}
}
