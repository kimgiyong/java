package ch07;

public class Test07 {
	
	static boolean isNumber(String str) {
		boolean ss = true;
		if(str=="null"||str=="") ss = false;
		else for(int a=0;a<str.length();a++) {
				char ch = str.charAt(a);
				if(!('0'<=ch&&ch<='9')) {
					ss = false;
					break;
				}
			}return ss;
		}
	
	public static void main(String args[]) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "12345o;";
		System.out.println(str+"는 숫자입니까? " +isNumber(str));
	}
}
