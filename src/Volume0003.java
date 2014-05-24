import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Volume0003 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		for(int i = 0; i < n ;i++){
			String[] inputs = reader.readLine().split(" ");
			int[] abc = new int[3];
			for(int j = 0 ; j < abc.length ; j++){
				abc[j] = Integer.parseInt(inputs[j]);
			}
			Arrays.sort(abc);
			if(Math.pow(abc[2], 2)== (Math.pow(abc[0], 2) + Math.pow(abc[1], 2))){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
