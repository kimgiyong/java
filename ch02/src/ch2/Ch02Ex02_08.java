package ch2;

import java.util.Scanner;

public class Ch02Ex02_08 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("첫번째 실수를 입력하세요.");
		String gate = first.nextLine();
		float a = Float.parseFloat(gate);
		System.out.print("두번째 실수를 입력하세요.");
		gate = first.nextLine();
		float b = Float.parseFloat(gate);
		System.out.print("문자하나를 입력하세요.");
		gate = first.nextLine();
		char c = gate.charAt(0);
		
		System.out.printf("%.2f\n%.2f\n%c",a,b,c);
	}
}
