import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Volume0020 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		while((input = reader.readLine()) != null){
			System.out.println(input.toLowerCase());
		}
	}

}
