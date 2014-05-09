import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Volume10004B {
	private final static int COUNT = 3;

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		String[] strArray = input.split(" ");
		int[] intArray = new int[COUNT];
		for(int i = 0; i < strArray.length ; i++ ){
			intArray[i] =  Integer.parseInt(strArray[i]);
		}
		//bubble sort
		for(int i = 0; i < COUNT ; i++ ){
			for(int j = 0 ; j < i ; j++){
				if(intArray[i] < intArray[j]){
					int k = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = k;
				}
			}
		}
		System.out.printf("%d %d %d",intArray[0],intArray[1],intArray[2]);
	}

}
