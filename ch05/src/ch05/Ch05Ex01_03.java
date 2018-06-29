package ch05;

import java.util.*;

public class Ch05Ex01_03 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		char a[] = new char[10];
		String gate = first.nextLine();
		
		for(int b=0;b<a.length;b++) {
			if(b==0||b==3||b==6) System.out.print(a[b]=gate.charAt(b));
		}
	}
}
