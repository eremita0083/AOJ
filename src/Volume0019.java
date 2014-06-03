import java.util.Scanner;

public class Volume0019 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			System.out.println(calc(n) +"");
		}
	}
	
	public static long calc(int n){
		long result = 1;
		for(int i = 2; i <= n ; i++){
			result *= i;
		}
		return result;
	}
}
