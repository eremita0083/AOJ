import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume10027 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] points = new int[2];
		for(int i = 0 ; i < n ; i++){
			String[] pair = reader.readLine().split(" ");
			if(pair[0].compareTo(pair[1]) > 0){
				points[0] += 3;
			}else if(pair[0].compareTo(pair[1]) < 0){
				points[1] += 3;
			}else{
				points[0] +=1;
				points[1] +=1;
			}
		}
		System.out.println(String.format("%s %s", points[0], points[1]));
	}
}
