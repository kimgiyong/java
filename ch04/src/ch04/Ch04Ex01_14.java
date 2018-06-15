package ch04;

import java.util.Scanner;

public class Ch04Ex01_14 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		
		if(a==2) System.out.print(28);
		else if(a<=7&&a%2!=0) System.out.print(31);
		else if(a<=7&&a%2==0) System.out.print(30);
		else if(a>=8&&a%2==0) System.out.print(31);
		else if(a>=8&&a%2!=0) System.out.print(30);
	}
}
