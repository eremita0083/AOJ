import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Volume100_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] array = reader.readLine().split(" ");
		int x = Integer.parseInt(array[0]);
		int y = Integer.parseInt(array[1]);
		double z = (double)x / (double)y;
		System.out.printf("%d %d %.6f", x/y, x%y , z);
	}

}
