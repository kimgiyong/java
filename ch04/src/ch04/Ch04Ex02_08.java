package ch04;

import java.util.Scanner;

public class Ch04Ex02_08 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		int a = 1,b=0,c=0;
		
		while(a!=0){
			a = first.nextInt();
			if(a%2==0 && a!=0) b++;
			else if(a%2!=0 && a!=0) c++;
		}System.out.println("odd : "+c);
		System.out.print("even : "+b);
	}
}
