package ch03;

public class OperatorEx14 {

	public static void main(String[] args) {
		char c = 'a';
		int i = 0;
		for(i=0; i<26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		c = 'A';
		for(i=0;i<26;i++) {
			System.out.print(c++);
		}System.out.println();
		
		c='0';
		for(i=0;i<10;i++) {
			System.out.print(c++);
		}
	}
}
