import java.util.Scanner;

public class Volume0004 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			int a, b, c, d, e, f;
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
			d = s.nextInt();
			e = s.nextInt();
			f = s.nextInt();
			double x = (double)(c * e - b * f) / (a * e - b * d);
			double y = (double)(c * d - a * f) / (b * d - a * e);
			System.out.printf("%.3f %.3f\n", x, y);
		}
	}

}