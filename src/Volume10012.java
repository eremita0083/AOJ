import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume10012 {
	private static final BufferedReader M_READER = new BufferedReader(
			new InputStreamReader(System.in));
	private static final String CELL = "#";

	public static void main(String[] args) throws IOException {
		while(true){
			String[] array = M_READER.readLine().split(" ");
			int height = Integer.parseInt(array[0]);
			int width = Integer.parseInt(array[1]);
			if(height ==0 && width ==0 ){
				return;
			}
			StringBuilder builder = new StringBuilder();
			for(int i = 0; i < height ; i++){
				for(int j = 0 ; j < width ; j++){
					builder.append(CELL);
				}
				builder.append("\n");
			}
			System.out.println(builder.toString());
		}
	}
}
