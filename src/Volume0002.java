import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume0002 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		long[] input = new long[2];
		while (true) {
			String str = reader.readLine();
			if (str == null) {
				break;
			}
			String[] strs = str.split(" ");
			for (int i = 0; i < strs.length; i++) {
				input[i] = Long.parseLong(strs[i]);
			}
			String sum = String.valueOf(input[0] + input[1]);
			int digitNum = sum.toCharArray().length;
			System.out.println(digitNum);
		}
	}
}
