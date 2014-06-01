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
		Collections.reverse(list);
		for(int i = 0 ; i < list.size() ; i++ ){
			if(i != 0) System.out.print(" ");
			System.out.print(list.get(i));
		}
		System.out.println("");
	}

}
