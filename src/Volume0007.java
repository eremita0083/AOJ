import java.math.BigDecimal;
import java.util.Scanner;


public class Volume0007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int debt = 100000;
		int weeks = scan.nextInt();
		for(int i = 0 ; i < weeks ; i++){
			debt *= 1.05;
			int a = debt % 1000;
			System.out.println(a);
			if(a > 0){
				debt -= a;
				debt += 1000;
			}
		}
		System.out.println(debt);
	}

}
