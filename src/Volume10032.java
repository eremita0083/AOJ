import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Volume10032 {

	/*ロボットを操作して、ブロックの山を作る。各ブロックにはアルファベット１文字で示された色が着いている。ロボットは以下の命令を実行する：

	push c: 色がｃであるブロックを山に積む
	pop: 山の頂点からブロックを１つ取り除く
	quit: 終了する
	最初、山は空（から）である。
	push a
push b
push c
pop
pop
push t
pop
quit

	ロボットへの命令を読み込んで、取り除かれたブロックの色を順番に出力するプログラムを作成せよ。*/
	private final static String QUIT = "quit";
	private final static String PUSH = "push";
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		List<String> stack = new ArrayList<String>();
		List<String> output = new ArrayList<String>();
		while(!(input = reader.readLine()).equals(QUIT)){
			String[] array = input.split(" ");
			if(array[0].equals(PUSH)){
				stack.add(array[1]);
			}else{
				String s = stack.get(stack.size()-1);
				output.add(s);
				stack.remove(stack.size()-1);
			}
		}
		for(String color : output){
			System.out.println(color);
		}
	}

}
