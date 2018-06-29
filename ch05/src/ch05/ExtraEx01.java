package ch05;

public class ExtraEx01 {
	public static void main(String args[]) {
		
		String a = "KOITT";
		String b = "APPLE";
		String c = "CAR";
		char result[] = new char[5];
		
		for(int d=0;d<=4;d++) {
			result[d] = a.charAt(d);
			System.out.print(result[d]);
		}
	}
}
