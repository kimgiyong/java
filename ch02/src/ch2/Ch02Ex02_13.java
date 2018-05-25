package ch2;

import java.util.Scanner;

public class Ch02Ex02_13 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요.");
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		System.out.print("두번째 수를 입력하세요.");
		gate = first.nextLine();
		int b = Integer.parseInt(gate);
		System.out.print("세번째 수를 입력하세요.");
		gate = first.nextLine();
		int c = Integer.parseInt(gate);
		int sum = a+b+c;
		int avg = (a+b+c)/3;
		
		System.out.printf("sum = %d\navg = 56",sum,avg);
	}
}
