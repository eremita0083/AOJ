import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Volume0016 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double x = 0, y = 0;
		double radian = 0;
		while (true) {
			String[] input = reader.readLine().split(",");
			int distance = Integer.parseInt(input[0]);
			int angle = Integer.parseInt(input[1]);
			if (distance == 0 && angle == 0) break;
			x += distance * Math.sin(radian);
			y += distance * Math.cos(radian);
	        	radian += Math.toRadians(angle);
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}

}
