package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("민수의 키와 몸무게를 입력하세요.>");
		String gate = first.next();
		int a = Integer.parseInt(gate);
		gate = first.next();
		int b = Integer.parseInt(gate);
		
		System.out.print("기영이의 키와 몸무게를 입력하세요.>");
		gate = first.next();
		int c = Integer.parseInt(gate);
		gate = first.next();
		int d = Integer.parseInt(gate);
		
		boolean e = a>c&&b>d ? true:false;
		
		System.out.printf("%b",e);
	}
}
