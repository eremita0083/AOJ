import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume0011 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] verticalBar =new int[Integer.parseInt(reader.readLine())+1];
		int horizontalBar =Integer.parseInt(reader.readLine());
		for(int i = 1 ; i < verticalBar.length ; i++){
			verticalBar[i] = i;
		}
		for(int i = 1 ; i <= horizontalBar ; i++){
			String[] input = reader.readLine().split(",");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			int z = verticalBar[x];
			verticalBar[x] = verticalBar[y];
			verticalBar[y] = z;
		}
		for(int i = 1 ; i < verticalBar.length ; i++){
			System.out.println(verticalBar[i]);
		}
		
	}

}
