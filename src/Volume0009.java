import java.util.Scanner;

public class Volume0009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int count = 0;
			switch (n) {
			case 1 :
				System.out.println(0);
				break;
			case 2:
				System.out.println(1);
				break;
			case 3:
				System.out.println(2);
				break;
			default:
				for (int i = 5; i <= n ; i += 2) {
					for (int j = 3; j <= i; j+= 2) {
						if (i % j == 0) {
							break;
						} else if (i - 2 == j) {
							count += 1;
						}
					}
				}
				System.out.println(count + 2);
				break;
			}
		}
	}
}
