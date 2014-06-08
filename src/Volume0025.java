import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Volume0025 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		while((input = reader.readLine()) != null){
			String[] a = input.split(" ");
			String[] b = reader.readLine().split(" ");
			int hit = 0, blow = 0;
			for(int i = 0; i < a.length ; i++){
				for(int j = 0; j < b.length ; j++){
					if(i == j && a[i].equals(b[j])){
						hit +=1;
						break;
					}else if(a[i].equals(b[j])){
						blow += 1;
						break;
					}
				}
			}
			System.out.printf("%d %d\n",hit,blow);
		}
	}

}
