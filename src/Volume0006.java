import java.util.Scanner;

public class Volume0006 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] input = scan.nextLine().toCharArray();
		for(int i = input.length-1; i >= 0 ; --i ){
			System.out.print(input[i]);
		}
		System.out.print("\n");
	}

}
