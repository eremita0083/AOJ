import java.io.IOException;
import java.util.Scanner;

public class Volume10018 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				c = (Character.isLowerCase(c)) ? Character.toUpperCase(c) : Character.toLowerCase(c); 
				System.out.print(c);
			}
			if(scan.hasNext()){
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
}
