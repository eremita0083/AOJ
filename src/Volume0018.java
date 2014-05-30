import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Volume0018 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i < 5 ; i++){
			list.add(scan.nextInt());
		}
		Collections.sort(list);
		for(int i = 0 ; i < 5 / 2 ; i++){
			int x = list.get(i);
			list.set(i, list.get(list.size() - (i+1)));
			list.set(list.size() - (i+1), x);
		}
		for(int i = 0 ; i < list.size() ; i++ ){
			if(i == list.size()-1){
				System.out.printf("%d\n",list.get(i));
				break;
			}
			System.out.printf("%d ", list.get(i));
		}
	}

}
