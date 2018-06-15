package ch04;

import java.util.Scanner;

public class Ch04Ex02_18 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		String gate = first.nextLine();
		int a = Integer.parseInt(gate);
		int b = a+(a-1);
		
		for(int c=1;c<=b;c++) {
			if(a>=c) 
				for(int d=1;d<=c;d++) {
					System.out.print("#");
				}
			else if(a<c) 
				for(int d=1;d<=a;d++) {
					if(c-a>=d)
						System.out.print(" ");
					else
						System.out.print("#");
				}System.out.println();
		}
	}	
}