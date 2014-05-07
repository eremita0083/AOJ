import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Volume100_13 {
	private static final BufferedReader READER = new BufferedReader(
			new InputStreamReader(System.in));
	private static final char CELL = '#';
	private static final char POINT = '.';

	public static void main(String[] args) throws IOException {
		while (true) {
			String[] input = READER.readLine().split(" ");
			int height = Integer.parseInt(input[0]);
			int width = Integer.parseInt(input[1]);
			if (height == 0 && width == 0) {
				return;
			}
			for (int i = 0; i < height; ++i) {
				char[] line = new char[width];
				if (i == 0 || i == height - 1) {
					Arrays.fill(line, CELL);
					System.out.println(line);
				} else {
					for (int j = 0; j < width; ++j) {
						if (j == 0 || j == width - 1) {
							line[j] = CELL;
						} else {
							line[j] = POINT;
						}
					}
					System.out.println(line);
				}
			}
			System.out.print("\n");
		}
	}

}
