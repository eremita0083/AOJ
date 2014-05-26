import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volume0015 {

	/**
	 * ある国の国家予算は 81 兆 7891 億もあります。このような大きな額の計算を行いたいと思うのですが、プログラムで普通に使われている 32
	 * ビットの符号付の整数では最大 21 億 4748 万 3647 までしか表すことが出来ません。そこで、80 桁までの 0
	 * 以上の整数を２つ入力し、その数の和を出力して終了するプログラムを作成して下さい。
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		for(int i = 0 ; i < n ; i++){
			long inputs1 = Long.parseLong(reader.readLine());
			long inputs2 = Long.parseLong(reader.readLine());
			System.out.println( inputs1 + inputs2);
		}
	}

}
