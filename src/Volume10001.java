public class Volume100_1 {

	public static void main(String[] args) {
		final int inputInt = new java.util.Scanner(System.in).nextInt();
		final int result = calc(inputInt);
		System.out.println(result);
	}
	
	private static int calc(int input){
		return	(int)Math.pow(input, 3);
	}

}
