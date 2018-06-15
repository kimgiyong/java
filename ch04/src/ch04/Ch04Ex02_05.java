package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a=0,b=0,c=0;;
		
		while(a!=-1) {
			a = first.nextInt();
			if(a%3==0) System.out.println(a/3);
		}
	}	
}