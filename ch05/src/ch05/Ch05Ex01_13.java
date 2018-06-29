package ch05;

public class Ch05Ex01_13 {
	public static void main(String args[]) {
		int a[][] = {
				{5,8,10,6,4}
				,{11,20,1,13,2}
				,{7,9,14,22,3}
		};
		for(int b=0;b<=2;b++) {
			for(int c=0;c<=4;c++) {
				System.out.printf("%2d ",a[b][c]);
			}System.out.println();
		}
	}
}
