package ch2;

import java.util.Scanner;

public class Ch02Ex02_09 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("첫번째 실수를 입력하세요.");
		String gate = first.nextLine();
		float a = Float.parseFloat(gate);
		System.out.print("두번째 실수를 입력하세요.");
		gate = first.nextLine();
		float b = Float.parseFloat(gate);
		System.out.print("세번째 실수를 입력하세요.");
		gate = first.nextLine();
		double c = Double.parseDouble(gate);
		
		System.out.printf("%.3f\n%.3f\n%.3f",a,b,c);
	}
}
