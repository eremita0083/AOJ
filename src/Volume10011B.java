import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Volume10011B {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(reader.readLine());
		String[] array = reader.readLine().split(" ");
		for(int i = array.length-1; i >= 0 ; i--){
			if(i == 0) {
				System.out.print(array[i]);
			}else{
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("");
	}

}
