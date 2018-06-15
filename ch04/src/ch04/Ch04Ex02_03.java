package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a=1;
		
		while(a!=0) {
			System.out.print("정수를 입력하세요.(0:종료)>");
			String gate = first.nextLine();
			a = Integer.parseInt(gate);
			if(a>0) System.out.println("positive integer");
			else if(a<0) System.out.println("negative number");
		}
	}
}
