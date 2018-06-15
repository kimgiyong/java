package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String[] gate = first.nextLine().split(" ");
		int a = Integer.parseInt(gate[0]);
		int b = Integer.parseInt(gate[1]);
		int c = Integer.parseInt(gate[2]);
		
		if(a<=b&&a<=c) System.out.print(a);
		else if(b<=a&&b<=c) System.out.print(b);
		else if(c<=a&&c<=b) System.out.print(c);
	}
}
