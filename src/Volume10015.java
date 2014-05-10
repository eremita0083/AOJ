import java.io.IOException;
import java.util.Scanner;

public class Volume10015 {
	private static final String[] ARCANA = { "S", "H", "C", "D" };

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in); //Scannerでもいけるやん
		boolean cards[][] = new boolean[4][13];
		int n = scan.nextInt();
		for (int i = 0; i < n ; i++) {
			String mark = scan.next();
			int number = scan.nextInt();
			for (int j = 0; j < ARCANA.length; j++) {
				if (mark.equals(ARCANA[j])) {
					cards[j][number - 1] = true; //カードが存在するデータにはtrueを、そうでないデータにはdefaultでfalseを
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (!cards[i][j]) {
					System.out.println(ARCANA[i] + " " + (j + 1)); //falseのデータだけ表示する
				}
			}
		}
	}
}
