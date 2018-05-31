package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("첫번쨰 수를 입력하세요.>");
		String gate = first.nextLine();
		double a = Double.parseDouble(gate);
		
		System.out.print("두번쨰 수를 입력하세요.>");
		gate = first.nextLine();
		double b = Double.parseDouble(gate);
		
		int c = (int)(a*b);
		int d = (int)a;
		int e = (int)b;
		
		d = d*e;
		System.out.printf("%d %d",c,d);
	}
}
