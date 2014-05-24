import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Volume10021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		String top = scan.nextLine();
		List<String> list = new ArrayList<String>();
		list.add(top);
		/* for (int i = 0; i < count-1; i++) {
			String str = scan.nextLine();
			if(top.compareTo(str)>0){
				top = str;
			}
		}
		System.out.println(top);*/
		for (int i = 0; i < count-1; i++) {
			String str = scan.nextLine();
			list.add(str);
		}
		System.out.println(Collections.min(list,null));
		/*for (int i = 0; i < count-1; i++) {
			String input = scan.nextLine();
			top = calc(0, top, input);
		}*/
	}

	public static String calc(int count, String top, String input) {
		if (top.equals(input)) {
			return top;
		}
		// System.out.println(count + " " + top + " " + input);
		if (top.charAt(count) - '0' > input.charAt(count) - '0') {
			top = input;
			return top;
		} else if (top.charAt(count) - '0' < input.charAt(count) - '0') {
			return top;
		} else {
			if(top.length()-1 == count || input.length()-1 == count){
				if(top.length()< input.length()){
					return top;
				}else{
					top = input;
					return top;
				}
			}
			return calc(count + 1, top, input);
		}
	}
}
