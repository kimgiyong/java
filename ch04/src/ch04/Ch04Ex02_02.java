package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		int b = 0;
		
		while(a>=1) {
			b=b+a;
			a--;
		}System.out.printf("%d",b);
	}
}
