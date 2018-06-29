package ch05;

import java.util.*;

public class Ch05Ex01_10 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		char a[] = new char[26];
		int count[] = new int[26];

		for(int b=0;;b++) {
			String gate = first.nextLine();
			char c = gate.charAt(0);
			if(!('A'<=c&&c<='Z'))
				break;
			else
				a[c-'A'] = c;
				count[c-'A']++;
		}
		for(int b=0;b<=25;b++) {
			if(count[b]>=1) {
				System.out.println(a[b]+":"+count[b]);
			}
		}
	}
}
