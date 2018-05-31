package ch03;

import java.util.Scanner;

public class Ch03Ex01_01 {
	public static void main(String[] args) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("첫번쨰 수를 입력하세요.>");
		String gate = first.nextLine();
		int a = Integer.parseInt(gate) + 100;
		
		System.out.print("두번쨰 수를 입력하세요.>");
		gate = first.nextLine();
		int b = Integer.parseInt(gate) % 10;
		
		System.out.printf("%d %d",a,b);
	}

}
