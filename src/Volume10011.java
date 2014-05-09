import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Volume10011 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(reader.readLine());
		String[] array = reader.readLine().split(" ");
		String[] sortArray = new String[count];
		for(int i = 0; i < count ; i++){
			sortArray[i] = array[count-i-1];
		}
		StringBuilder builder = new StringBuilder();
		for(String str : sortArray){
			builder.append(str+" ");
		}
		String result = builder.toString();
		System.out.println(result.trim());
	}

}
