import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Volume0001 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> mts = new ArrayList<Integer>();
		for(int i = 0 ; i < 10 ; i++){
			mts.add(Integer.parseInt(reader.readLine()));
		}
		Collections.sort(mts);
		for(int i = mts.size()-1 ; i >= mts.size() -4 ; --i){
			System.out.println(mts.get(i));
		}
	}

}
