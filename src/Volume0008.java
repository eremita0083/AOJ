import java.util.Scanner;

public class Volume0008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int count = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					for (int k = 0; k < 10; k++) {
						int x = n - (i + j + k);
						if (x >= 0 && x <= 9) {
							count += 1;
						}
					}
				}
			}
			System.out.println(count);
		}
	}

}
