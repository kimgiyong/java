package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		String[] gate = first.nextLine().split(" ");
		int a = Integer.parseInt(gate[0]);
		int b = Integer.parseInt(gate[1]);
		
		for(int c=1;c<=9;c++) {
			if(a>=b) 
				for(int d=a;d>=b;d--) {
					System.out.printf("%d*%d=%2d\t",d,c,d*c);
				}
			else if(a<=b) 
				for(int d=a;d<=b;d++) {
					System.out.printf("%d*%d=%2d\t",d,c,d*c);
				}System.out.println();
		}
	}	
}