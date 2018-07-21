package ch06;

class BlockTest2 {
	static {
		System.out.println("static { }");
	}
	{
		System.out.println("{ }");
	}
	public BlockTest2() {
		System.out.println("생성자");
		BlockTest2.BlockTest3(5);
	}
	static int BlockTest3(int a) {
		System.out.println("aaa");
		return a;
	}

}
class BlockTest{
	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest2 bt = new BlockTest2();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		bt.BlockTest3(4);
	}
}
