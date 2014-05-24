import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Volume0005 {
	/*
	 * ２０億以下の正の整数 a, b を入力したとき、a と b の最大公約数と最小公倍数を出力して終了するプログラムを作成して下さい。ただし、a と
	 * b の最小公倍数は 20 億を超えないものとします。
	 * 
	 * Input 複数のデータセットが与えられます。各データセットは１行に a と b
	 * が１つのスペースで区切られて与えられます。入力の最後まで処理して下さい。
	 * 
	 * Output 各データセットに対して、最大公約数と最小公倍数を１つのスペースで区切って１行に出力して下さい。
	 * 
	 * Sample Input 8 6 50000000 30000000 Output for the Sample Input 2 24
	 * 10000000 150000000
	 */

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String[] line = reader.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			System.out.println(min+ "です");

	}

	public static int calc(int max, int min) {
		while (max != min) {
			int c = max - min;
			if (c > min) {
				calc(c, min);
			} else {
				calc(min, c);
			}
		}
		return max;
	}

}
