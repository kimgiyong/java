package ch2;

import java.util.Scanner;

public class Ch02Ex02_06 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("야드를 입력하세요.");
		String gate = first.nextLine();
		float a = Float.parseFloat(gate);
		float yd = a * 91.44F;
		System.out.print("인치를 입력하세요.");
		gate = first.nextLine();
		float b = Float.parseFloat(gate);
		float in = b * 2.54F;
		System.out.printf("%4.1fyd = %5.1fcm\n",a,yd);
		System.out.printf("%4.1fin = %5.1fcm\n",b,in);
	}
}
