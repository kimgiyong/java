package test3;

import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class ListTest03 {
	public static void main(String args[]) {
		ArrayList<String> strList = new ArrayList<String>();
		//반복문을 사용해서 1~30까지의 랜덤숫자를 10개 리스트에 추가 그리고 출력
		for(int a = 0;a<10;a++) {
			String ss = ""+(int)((Math.random()*30)+1);
		
		//	if(ss.length()<2) {
	//			ss = "0" + ss;
	//		}
			ss = StringUtils.leftPad(ss, 2,'0');
			strList.add(ss);
			System.out.println(strList.get(a));
		}
		Collections.sort(strList);
		for(int a = 0;a<10;a++) {
			System.out.println(strList.get(a));
		}
	}
}
