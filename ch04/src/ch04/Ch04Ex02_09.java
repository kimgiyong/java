package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a=0,b=0,c=0;;
		
		while(0<=a&&a<=100) {
			a = first.nextInt();
			b+=a;
			c++;
		}b-=a; c--;
		System.out.println("sum : " + b);
		System.out.printf("avg : %.1f",(double)b/c);
	}	
}