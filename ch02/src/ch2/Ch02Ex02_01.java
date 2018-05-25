package ch2;

import java.util.Scanner;

public class Ch02Ex02_01 {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("kor ");
		String gate = num.nextLine();
		int kor = Integer.parseInt(gate);
		System.out.print("mat ");
		gate = num.nextLine();
		int mat = Integer.parseInt(gate);
		System.out.print("eng ");
		gate = num.nextLine();
		int eng = Integer.parseInt(gate);
		int sum = kor+mat+eng;
		System.out.printf("sum %d\n",sum);
		int avg = (kor+mat+eng)/3;
		System.out.printf("avg %d",avg);
	}
}
