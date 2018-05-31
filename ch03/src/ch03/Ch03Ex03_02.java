package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {
	public static void main(String args[]) {
		Scanner first = new Scanner(System.in);
		
		System.out.print("첫번쨰 수를 입력하세요.>");
		String gate = first.nextLine();
		int a = Integer.parseInt(gate); //첫번째 수 입력
		
		System.out.print("두번쨰 수를 입력하세요.>");
		gate = first.nextLine();
		int b = Integer.parseInt(gate); //두번쨰 수 입력
		
		int c = a/b; //첫번쨰 수와 두번쨰수를 나눈값을 c에 저장
		double d = (double)a; // 첫번쨰 수를 double로 변환
		d = d/b; //변환한 처선째 수와 두번째 수를 나눈것을 d에 재입력
		
		System.out.printf("%d %.2f",c,d);
	}
}
