import java.util.Scanner;

public class Volume10022 {
	private static String sModelString;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		sModelString = scan.nextLine();
		int count = 0;
		while(true){
			String word = scan.next();
			if(word.equals("END_OF_TEXT")){
				System.out.println(count+"");
				return;
			}
			if(sModelString.equals(word.toLowerCase())){
				count += 1;
			}
		}
	}
}
