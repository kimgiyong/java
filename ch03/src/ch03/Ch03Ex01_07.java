package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {
	public static void main(String[] args) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("첫번쨰 수를 입력하세요.>");
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		
		System.out.print("두번쨰 수를 입력하세요.>");
		gate = first.nextLine();
		int b = Integer.parseInt(gate);
		
		System.out.print("세번쨰 수를 입력하세요.>");
		gate = first.nextLine();
		int c = Integer.parseInt(gate);
		
		boolean d = a>b&&a>c ? true:false;
		boolean e = a==b&&a==c ? true:false;
		
		System.out.printf("%b %b",d,e);
	}

}
