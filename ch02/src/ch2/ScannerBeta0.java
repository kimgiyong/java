package ch2;

import java.util.Scanner;

public class ScannerBeta0 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2자리 정수 입력 : ");
		String a = scan.nextLine();
		int b = Integer.parseInt(a);
		
		System.out.printf("10진수 : %d\n8진수 : %o\n 16진수 : %x",b,b,b);
	}
}
