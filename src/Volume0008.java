import java.util.Scanner;

public class Volume0008 {

	// 再帰で書ける、後で書き直su
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int count = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					for (int k = 0; k < 10; k++) {
						for (int l = 0; l < 10; l++) {
							if (i + j + k + l == n) {
								count += 1;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}

}
