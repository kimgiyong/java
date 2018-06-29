package ch05;

import java.util.*;

public class Ch05Ex02_01 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		String gate[] = first.nextLine().split(" ");
		
		for(int a=gate.length-1;a>=0;a--) {
			char b = gate[a].charAt(0);
			System.out.print(b + " ");
		}
	}
}
