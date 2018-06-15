package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("첫번쨰 과목을 입력하세요.>");
		String gate = first.nextLine();
		double a = Double.parseDouble(gate); // 첫번쨰 수 입력
		System.out.print("두번쨰 과목을 입력하세요.>");
		gate = first.nextLine();
		double b = Double.parseDouble(gate); // 두번쨰 수 입력
		System.out.print("세번쨰 과목을 입력하세요.>");
		gate = first.nextLine();
		double c = Double.parseDouble(gate); // 세번쨰 수 입력
		
		int e = (int)a; //a를 int형식으로 바꿔서 e에 저장
		e = e+(int)b; // b를 int형식으로 바꿔서 e와 더한후 저장
		e = e+(int)c; // c를 int형식으로 바꿔서 e와 더한후 저장
		int f = (int)a + (int)b + (int)c;
		double d = (a+b+c)/3; //첫번째,두번째,세번째수의 평균 double형식으로 구함
		
		System.out.printf("sum %d%n",f);
		System.out.printf("avg %.0f%n",d);
	}
}
