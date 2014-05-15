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
		reader.readLine();
		String[] s = reader.readLine().split(" ");
		reader.readLine();
		String[] q = reader.readLine().split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int counter = 0;
	    Arrays.sort(s);
	    for (int i = 0; i < q.length; i++) {
	    	if (Arrays.binarySearch(s, q[i]) >= 0) {
	    		counter++;
	        }
	    }
		System.out.println(map.size());
	}
}
/*BufferedReader reader = new BufferedReader(new InputStreamReader(
        System.in));
int sCount = Integer.parseInt(reader.readLine());
String[] s = reader.readLine().split(" ");
int qCount = Integer.parseInt(reader.readLine());
String[] q = reader.readLine().split(" ");
Map<String, Integer> map = new HashMap<String, Integer>();
int minCount = Math.min(sCount,qCount);
for (String sStr : s) {
    if (minCount > Integer.parseInt(sStr)) {
        for (String qstr : q) {
            if (sStr.equals(qstr)) {
                map.put(qstr, null);
            }
        }
    }
}
System.out.println(map.size());*/