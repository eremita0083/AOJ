import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume100_6 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		for(int i =1 ;; i++){
			int x = Integer.parseInt(reader.readLine());
			if(x != 0 ){
				System.out.println("Case " + i +": " + x);
			}else{
				break;
			}
		}
	}
}