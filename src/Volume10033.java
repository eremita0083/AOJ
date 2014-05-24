import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Volume10033 {
	private final static String QUIT = "quit";
	private final static String PUSH = "push";
	private final static String POP = "pop";
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Map<String,List<String>> stack = new HashMap<String,List<String>>();
		List<String> output = new ArrayList<String>();
		int numOfMt = Integer.parseInt(reader.readLine());
		for(int i = 1; i <= numOfMt ; i++){
			stack.put(i+"", new ArrayList<String>());
		}
		String input; 
		while(!(input = reader.readLine()).contains(QUIT)){
			if(input.contains(PUSH)){
				String blockNum = input.split(" ")[1];
				String color = input.split(" ")[2];
				stack.get(blockNum).add(color);
			}else if(input.contains(POP)){
				String blockNum = input.split(" ")[1];
				List<String> target = stack.get(blockNum);
				output.add(target.get(target.size()-1));
				target.remove(target.size()-1);
			}else{
				String from = input.split(" ")[1];
				String to = input.split(" ")[2];
				List<String> fromTarget = stack.get(from);
				List<String> toTarget = stack.get(to);
				toTarget.add(fromTarget.get(fromTarget.size()-1));
				fromTarget.remove(fromTarget.size()-1);
			}
		}
		for(String s : output){
			System.out.println(s);
		}
	}

}
