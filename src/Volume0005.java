import java.io.IOException;
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
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			int a = s.nextInt();
			int b = s.nextInt();
			int x = gcd(a, b);
			int y = a / x * b; // 掛ける順番に注意(a * b を先に行うとオーバーフローする)
			System.out.println(x + " " + y);
		}
	}

	public static int gcd(int m, int n) {
		if (m < n) {
			int k = m;
			m = n;
			n = k;
		}
		if (n == 0) {
			return m;
		}
		return gcd(n, m % n);
	}
}