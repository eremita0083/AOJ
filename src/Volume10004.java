import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Volume10004 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		String[] array = input.split(" ");
		int x = Integer.parseInt(array[0]);
		int y = Integer.parseInt(array[1]);
		int z = Integer.parseInt(array[2]);
		int[] intArray = {x,y,z};
		if(x <= z && z <= y){
			intArray[0] = x;
			intArray[1] = z;
			intArray[2] = y;
		}else if(x >= y && y >= z){
			intArray[0] = z;
			intArray[1] = y;
			intArray[2] = x;
		}else if(x >= y && x <= z){
			intArray[0] = y;
			intArray[1] = x;
			intArray[2] = z;
		}else if(x >= z && y >= x){
			intArray[0] = z;
			intArray[1] = x;
			intArray[2] = y;
		}else if(x >= z && y <= z){
			intArray[0] = y;
			intArray[1] = z;
			intArray[2] = x;
		}
		// Arrays.sort(intArray);
		System.out.println(intArray[0] + " "+ intArray[1]+" " +intArray[2]);
	}

}
