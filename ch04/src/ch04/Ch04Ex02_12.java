package ch04;

public class Ch04Ex02_12 {
	public static void main(String args[]) {
		int a=0,b=0,c=0;
		
		for(a=2;a<=4;a++) {
			for(b=2;b<=5;b++) {
				System.out.printf("%d * %d =  %-4d",a,b,a*b);
			}System.out.println();
		}
	}	
}