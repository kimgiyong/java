package ch2;

import java.util.Scanner;

public class Ch02Ex02_04 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요.>");
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		System.out.print("숫자를 입력하세요.>");
		gate = first.nextLine();
		int b = Integer.parseInt(gate);
		int min = a-b;
		
		System.out.printf("%d - %d = %d",a,b,min);
	}
}
