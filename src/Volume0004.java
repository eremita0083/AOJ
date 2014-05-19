import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume0004 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String[] strs = reader.readLine().split(" ");
		double[] n = new double[strs.length];
		for (int i = 0; i < n.length; i++) {
			n[i] = Double.parseDouble(strs[i]);
		}
		double a = n[2] * n[4] - n[1] * n[5];
		double x = (n[4] * n[0] - n[1] * n[3]) /a;
		double y = (n[2] - n[0] * x) / n[1];
		System.out.printf("%.3f %.3f",x,y);
	}

}
