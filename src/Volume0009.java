import java.util.Scanner;

public class Volume0009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			boolean[] isPrime = new boolean[n + 1];
			for (int i = 2; i <= n; i++) {
				isPrime[i] = true;
			}
			for (int i = 2; i <= n; i++) {
				if (!isPrime[i]) continue;
				for (int j = i * 2; j <= n; j += i) {
					isPrime[j] = false;
				}
			}
			int count = 0;
			for (int i = 2; i <= n; i++) {
				if (isPrime[i]) count++;
			}
			System.out.println(count);
		}
	}
}
