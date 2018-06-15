package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a=1,b=0,c=0;;
		
		while(1<=a&&a<=4) {
			System.out.printf("1.Korea%n2.USA%n3.Japan%n4.China%nnumber?");
			a = first.nextInt();
			if(a==1) System.out.println("Seoul");
			else if(a==2) System.out.println("Washington");
			else if(a==3) System.out.println("Tokyo");
			else if(a==4) System.out.println("Beijing");
		}
	}	
}