import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Volume0017 {

/**
Sample Input
 
xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt.

Output for the Sample Input

this is the picture that i took in the trip.


途中。また明日考える。
*/
	private static final String[] KEYS = {"the","this","that"};
	private static final char[] ALPHABETS = {'a','b','c','d','e','f','g','h','i',
		'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String inputs;
		while(!(inputs = reader.readLine()).isEmpty()){
			int collapseNum = 0;
			char[] charArray = inputs.toCharArray();
			for(int i = 0 ; i < charArray.length ; i++){
				for(int j = 0 ; j < ALPHABETS.length ; j++){
					if( charArray[i] >= ALPHABETS[0] && charArray[i] <= ALPHABETS[ALPHABETS.length-1]){
						//TODO
					}
				}
			}
		}
	}

}
