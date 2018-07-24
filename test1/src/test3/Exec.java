package test3;

import java.util.*;

public class Exec {
	public static void main(String args[]) {
		ArrayList<Person> pList = new ArrayList<Person>();
		for(int a = 0;a<5;a++) {
			//이름은 테스트1~테스트5 나이는 10~50 포인트는 아무거나
			pList.add(new Person());
			pList.get(a).setName("테스트"+(a+1));
			pList.get(a).setAge((1+a)*10);
			pList.get(a).setPoint((int)(Math.random()*10));
			System.out.print("이름 : " + pList.get(a).getName() + " ");
			System.out.print("나이 : " + pList.get(a).getAge() + " ");
			System.out.println("포인트 : " + pList.get(a).getPoint());
		}
	}
}
