import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Volume10032 {
	private final static String QUIT = "quit";
	private final static String PUSH = "push";
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<String> stack = new ArrayList<String>();
		List<String> output = new ArrayList<String>();
		String input;
		while(!(input = reader.readLine()).equals(QUIT)){
			String[] array = input.split(" ");
			if(array[0].equals(PUSH)){
				stack.add(array[1]);
			}else{
				String s = stack.get(stack.size()-1);
				output.add(s);
				stack.remove(stack.size()-1);
			}
		}
		for(String color : output){
			System.out.println(color);
		}
	}

}
