import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume100_14 {
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
			char[] newLine = new char[width];
			for (int i = 0; i < height; i++) {
				if (newLine[0] != CELL) {
					char[] line = new char[width];
					for (int j = 0; j < width; j++) {
						if ((i == 0 && j == 0) || j % 2 == 0) {
							line[j] = CELL;
						} else {
							line[j] = POINT;
						}
					}
					System.out.println(line);
					newLine = line;
				} else {
					char[] line = new char[width];
					for (int j = 0; j < width; j++) {
						if ((i == 0 && j == 0) || j % 2 == 0) {
							line[j] = POINT;
						} else {
							line[j] = CELL;
						}
					}
					System.out.println(line);
					newLine = line;
				}
			}
			System.out.print("\n");
		}
	}

}
