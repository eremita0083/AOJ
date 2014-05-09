import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Volume10003 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		String[] array = input.split(" ");
		int x = Integer.parseInt(array[0]);
		int y = Integer.parseInt(array[1]);
		if(x > y){
			System.out.println("a > b");
		}else if(x < y){
			System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}

	}

}
