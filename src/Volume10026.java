import java.util.Scanner;

public class Volume10026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			if(n == 0){
				System.out.print("\n");
				break;
			}
			int[] results = new int[n];
			double m = 0;
			for(int i = 0; i < n ; ++i){
				results[i] = scan.nextInt();
				m += results[i];
				if(i == n-1){
					m /= n;
				}
			}
			double total = 0;
			for(double d : results){
				total += Math.pow(d - m,2);
			}
			double a = total / n;
			double z = Math.sqrt(a);
			System.out.println(z);
		}

	}
}
