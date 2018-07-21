package ch07;

class Test05 {
	static int[] shuffle(int[] arr) {
		for(int a=0;a<arr.length;a++) {
			int tmp = 0;
			int random = (int)(Math.random()*9);
			tmp = arr[a];
			arr[a] = arr[random];
			arr[random] = tmp;	
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}