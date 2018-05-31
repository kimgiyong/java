package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("첫번쨰 과목을 입력하세요.>");
		String gate = first.nextLine();
		int a = Integer.parseInt(gate); // 첫번쨰 수 입력
		System.out.print("두번쨰 과목을 입력하세요.>");
		gate = first.nextLine();
		int b = Integer.parseInt(gate); // 두번쨰 수 입력
		System.out.print("세번쨰 과목을 입력하세요.>");
		gate = first.nextLine();
		int c = Integer.parseInt(gate); // 세번째 수 입력
		
		double d = (double)(a+b+c)/3; //평균 double형식으로 구함
		
		System.out.printf("%.1f",d);
	}
}
