import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume100_9 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(reader.readLine());
		double area = r * r * 3.141592653589;
		double length = r * 2 * 3.141592653589;
		System.out.printf("%.6f %.6f", area, length);
		
	}

}
