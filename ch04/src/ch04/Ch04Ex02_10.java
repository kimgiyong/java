package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a=1,b=0,c=0;;
		
		while(a!=0) {
			a = first.nextInt();
			if(a%3!=0&&a%5!=0&&a!=0) b++;
		}System.out.println(b);
	}	
}