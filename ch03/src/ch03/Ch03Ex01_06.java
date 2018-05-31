package ch03;

import java.util.Scanner;

public class Ch03Ex01_06 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요.>");
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		
		System.out.print("첫번째 수를 입력하세요.>");
		gate = first.nextLine();
		int b = Integer.parseInt(gate);
		boolean c = a!=0 ? true : false;
		boolean d = b!=0 ? true : false;
		
		System.out.printf("%b %b",c&&d,c||d);
	}
}
