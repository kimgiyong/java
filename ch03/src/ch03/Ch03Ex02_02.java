package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("첫번쨰 수를 입력하세요.>");
		String gate = first.nextLine();
		int a = Integer.parseInt(gate) + 5;
		
		System.out.print("두번쨰 수를 입력하세요.>");
		gate = first.nextLine();
		int b = Integer.parseInt(gate) * 2;
		
		System.out.printf("width = %d%n",a);
		System.out.printf("length = %d%n",b);
		System.out.printf("area = %d",a*b);
	}
}
