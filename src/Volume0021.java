import java.util.Scanner;

public class Volume0021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		while((n = scan.nextInt()) != 0){
			long result = 0;
			long max = Long.MIN_VALUE; // ここが０だとダメなので注意
			for(int i = 0; i < n ; i++){
				long input = scan.nextLong();
				result = Math.max(result + input, input);
				max = Math.max(result, max);
			}
			System.out.println(max);
		}
	}

}
