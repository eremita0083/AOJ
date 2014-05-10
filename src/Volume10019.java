import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume10019 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			String input = reader.readLine();
			if(Integer.parseInt(input.substring(0,1)) == 0){
				return;
			}
			int sum = 0;
			for(int i = 0; i < input.length() ; ++i){
				int j = Integer.parseInt(input.substring(i,i+1));
				sum += j;
			}
			System.out.println(sum);
		}
	}

}
