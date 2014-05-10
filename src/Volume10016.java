import java.util.Scanner;

public class Volume10016 {
	private static final String[] RESULTS = {"A","B","C","D","F"};

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			if(m == -1 && f == -1 && r == -1){
				return;
			}
			int sum = m+f;
			if(m == -1 || f == -1){
				System.out.println(RESULTS[4]);
			}else if(sum >= 80){
				System.out.println(RESULTS[0]);
			}else if(sum >= 65 && sum < 80){
				System.out.println(RESULTS[1]);
			}else if(sum >= 50 && sum < 65){
				System.out.println(RESULTS[2]);
			}else if(sum >= 30 && sum < 50 && r >= 50){
				System.out.println(RESULTS[2]);
			}else if(sum >= 30 && sum < 50){
				System.out.println(RESULTS[3]);
			}else{
				System.out.println(RESULTS[4]);
			}
		}
	}
}
