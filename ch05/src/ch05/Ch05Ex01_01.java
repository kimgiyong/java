package ch05;

import java.util.*;

public class Ch05Ex01_01 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		char a[] = new char[10];
		String[] gate = first.nextLine().split(" ");
		
		for(int b=0;b<a.length;b++) {
			System.out.print(a[b]=gate[b].charAt(0));
		}
	}
}
