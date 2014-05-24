import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Volume10031 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int sCount = Integer.parseInt(reader.readLine());
		String[] s = reader.readLine().split(" ");
		int qCount = Integer.parseInt(reader.readLine());
		String[] q = reader.readLine().split(" ");
		int count = 0;
		int minCount = Math.min(sCount, qCount);
		if (minCount == qCount) {
			Arrays.sort(s);
			for (int i = 0; i < minCount; i++) {
				if (Arrays.binarySearch(s, q[i]) >= 0) {
					count++;
				}
			}
		}else {
			Arrays.sort(q);
			for (int i = 0; i < minCount; i++) {
				if (Arrays.binarySearch(q, s[i]) >= 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
/*
 * BufferedReader reader = new BufferedReader(new InputStreamReader(
 * System.in)); int sCount = Integer.parseInt(reader.readLine()); String[] s =
 * reader.readLine().split(" "); int qCount =
 * Integer.parseInt(reader.readLine()); String[] q =
 * reader.readLine().split(" "); Map<String, Integer> map = new HashMap<String,
 * Integer>(); int minCount = Math.min(sCount,qCount); for (String sStr : s) {
 * if (minCount > Integer.parseInt(sStr)) { for (String qstr : q) { if
 * (sStr.equals(qstr)) { map.put(qstr, null); } } } }
 * System.out.println(map.size());
 */