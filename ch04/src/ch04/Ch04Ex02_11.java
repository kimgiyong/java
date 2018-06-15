package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a=0,b=0,c=0;;
		char ch = 'Y';
		while(ch=='Y'||ch=='y') {
			System.out.print("Base = ");
			String gate = first.nextLine();
			a = Integer.parseInt(gate);
			System.out.print("Height = ");
			gate = first.nextLine();
			b = Integer.parseInt(gate);
			System.out.printf("Triangle area = %.1f\n",(double)(a*b)/2);
			System.out.print("Contiune?");
			gate = first.nextLine();
			ch = gate.charAt(0);
		}
	}	
}