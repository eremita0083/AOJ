import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Volume10015 {
	private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	private static final String SPADE = "S";
	private static final String HEART = "H";
	private static final String CLUB = "C";
	private static final String DAIA = "D";

	public static void main(String[] args) throws IOException {
		int count = Integer.parseInt(READER.readLine().split(" ")[0]);
		List<String> input = new ArrayList<String>();
		for(int i = 0; i < count ; i++){
			input.add(READER.readLine());
		}
		List<String> correct = new ArrayList<String>();
		for(int i = 0; i < 13 ; i++){
			correct.add(SPADE+" "+(i+1));
		}
		for(int i = 0; i < 13 ; i++){
			correct.add(HEART+" "+(i+1));
		}
		for(int i = 0; i < 13 ; i++){
			correct.add(CLUB+" "+(i+1));
		}
		for(int i = 0; i < 13 ; i++){
			correct.add(DAIA+" "+(i+1));
		}
		for(int i = 0; i < input.size() ; i++){
			correct.remove(input.get(i));
		}
		for(String str: correct){
			System.out.println(str);
		}
	}

}
