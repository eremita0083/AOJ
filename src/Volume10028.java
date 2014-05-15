import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Volume10028 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] numbers = new int[n];
		String[] str = reader.readLine().split(" ");
		for(int i = 0 ; i < n ; ++i){
			numbers[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(numbers);
		for(int j =0; j < numbers.length ; ++j){
			if( j == numbers.length-1){
				System.out.println(numbers[j]);
			}else{
				System.out.print(numbers[j] + " ");
			}
		}
	}

}
