package ch05;

import java.util.*;

public class Ch05Ex02_06 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		char a[] = {'A','P','P','L','E','!'};
		String gate = first.nextLine();
		int b;
		int c=0;
		
		for(b=0;b<=a.length-1;b++) {
			if(a[b]==gate.charAt(0)) {
				System.out.print(b + " ");
				c++;
			}
			else if(b==a.length-1&&c==0) {
				System.out.print("none");
				break;
			}
		}
	}
}
