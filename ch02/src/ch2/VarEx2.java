package ch2;

public class VarEx2 {

	public static void main(String[] args) {
		int x = 10, y = 20; // 변수 x, y를 선언하고, 각각 10과 20으로 초기화
		int tmp = 0; // 변수 tmp를 선언하고, 0으로 초기화
		
		System.out.println("x:"+ x + " y:" + y); // x와 y값 출력
		
		tmp = x; //x의 값을 tmp 변수에 저장
		x = y; // x변수에 y값을 저장
		y = tmp; // y변수에 tmp값을 저장
		
		System.out.println("x:" + x + " y:" + y); // x와 y값 출력
	}

}
