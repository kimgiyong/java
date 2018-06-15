package ch04;

import java.util.Scanner;

public class FlowEx28 {
	public static void main(String args[]) {
		int input = 0, answer = 0, count=0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 정수를 입력하세요 :");
			input = scanner.nextInt();
			
			if(input>answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}else if(input<answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(input==answer) {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번입니다.");
				break;
			}
		}while(true);
	}
}
