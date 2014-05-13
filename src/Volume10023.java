import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume10023 {
	private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		while (true) {
			String line = READER.readLine();
			if(line.substring(0,1).equals("-")){
				return;
			}
			int count = Integer.parseInt(READER.readLine());
			for(int i = 0; i < count ; i++){
				int shuffle = Integer.parseInt(READER.readLine());
				line = line.substring(shuffle) + line.substring(0,shuffle);
			}
			System.out.println(line);
		}

	}

}
