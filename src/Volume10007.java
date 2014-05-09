import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume10007 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		for(int i =1 ;; i++){
			String[] array = reader.readLine().split(" ");
			int x = Integer.parseInt(array[0]);
			int y = Integer.parseInt(array[1]);
			if(x == 0 && y == 0 ){
				break;
			}else if(Math.max(x, y) != x){
				System.out.println(x +" "+ y);
			}else{
				System.out.println(y +" "+ x);
			}
		}
	}
}