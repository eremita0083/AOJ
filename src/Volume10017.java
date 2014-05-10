import java.util.Scanner;

public class Volume10017 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			if (n == 0 && x == 0) {
				return;
			}
			int result = 0;
			for(int i = 1; i <= n ; i++){
				for(int j = i + 1 ; j <= n ; j++){
					for(int k = j + 1; k <= n ; k++){
						if(i + j + k == x){
							result += 1;
						}
					}
				}
			}
			System.out.println(result+"");
		}
	}

}
