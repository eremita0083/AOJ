import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Volume0013 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<String> cars = new ArrayDeque<String>();
        String str;
        while((str = reader.readLine()) != null){
            if(str.equals("0")){
                System.out.println(cars.pop());
            }else if(!str.equals("0")){
                cars.push(str);
            }
        }
	}
}

/*Scanner scan = new Scanner(System.in);
List<Integer> outputList = new ArrayList<Integer>();
List<Integer> inputList = new ArrayList<Integer>();
do{
	int input = scan.nextInt();
	if(input == 0){
		outputList.add(inputList.get(inputList.size()-1));
		inputList.remove(inputList.size()-1);
	}else if( input > 0){
		inputList.add(input);
	}
}while(inputList.size() != 0);
for(int output : outputList){
	System.out.println(output);
}*/

/*List<Integer> outputList = new ArrayList<Integer>();
List<Integer> inputList = new ArrayList<Integer>();
do{
	String str = reader.readLine();
	if(str.equals("")){
		break;
	}
	int input = Integer.parseInt(str);
	if(input == 0){
		outputList.add(inputList.get(inputList.size()-1));
		inputList.remove(inputList.size()-1);
	}else if( input > 0){
		inputList.add(input);
	}
}while(true);
for(int output : outputList){
	System.out.println(output);
}*/