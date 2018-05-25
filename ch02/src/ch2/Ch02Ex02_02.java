package ch2;

import java.util.Scanner;

public class Ch02Ex02_02 {
	public static void main(String args[]) {
		Scanner key = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요.>");
		String a = key.nextLine();
		int b = Integer.parseInt(a);
		
		System.out.printf("%d",b);
	}
}
