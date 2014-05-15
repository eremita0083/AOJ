import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Volume10030 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] n = new int[2]; 
		List<Integer> s = new ArrayList<Integer>(),t = new ArrayList<Integer>(),u = new ArrayList<Integer>();
		for(int i = 0; i < 2 ; ++i){
			n[i] = Integer.parseInt(reader.readLine());
			if(i == 0){
				for(String str : reader.readLine().split(" ")){
					s.add(Integer.parseInt(str));
				}
			}else{
				for(String str : reader.readLine().split(" ")){
					t.add(Integer.parseInt(str));
				}
			}
		}
		for(int i: s){
			for(int j: t){
				if(i == j && !u.contains(i)){
					u.add(i);
				}
			}
		}
		System.out.println(u.size());
	}
}
