import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Volume100_10 {
	private static final BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		while(true){
			String[] inputArray = sReader.readLine().split(" ");
			int x = Integer.parseInt(inputArray[0]);
			String op = inputArray[1];
			int y = Integer.parseInt(inputArray[2]);
			int result = 0;
			if(op.equals("+")){
				result = x + y;
			}else if(op.equals("-")){
				result = x - y;
			}else if(op.equals("/")){
				result = x / y;
			}else if(op.equals("*")){
				result = x * y;
			}else if(op.equals("?")){
				return;
			}
			System.out.println(result);
		}
	}

}
