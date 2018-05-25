package ch2;

import java.util.Scanner;

public class Ch02Ex02_14 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("yard? ");
		String gate = first.nextLine();
		float a = Float.parseFloat(gate);
		float yd = a * 91.44F;
		System.out.printf("%.1fyard = %.1fcm",a,yd);
	}
}
