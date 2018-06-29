package ch05;

public class Ch05Ex01_02 {
	public static void main(String args[]) {
		int a[] = new int[10];
		
		for(int b=0;b<a.length;b++) {
			a[b]=b+1;
			System.out.printf("%d ", a[b]);
		}
	}
}
