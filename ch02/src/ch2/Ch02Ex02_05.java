package ch2;

import java.util.Scanner;

public class Ch02Ex02_05 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요.");
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		System.out.print("두번째 수를 입력하세요.");
		gate = first.nextLine();
		float b = Float.parseFloat(gate);
		float mul = a*b;
		
		System.out.printf("%d * %f = %f",a,b,mul);
	}
}
