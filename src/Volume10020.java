import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Volume10020 {
	private static char[] ALPHABETS = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
			'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
			'v', 'w', 'x', 'y', 'z' };

	public static void main(String[] args) {
		Map<Character, Integer> countRecord = new HashMap<Character, Integer>();
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String input = scan.nextLine();
			if(input.isEmpty()){
				break;
			}
			for (int i = 0; i < input.length(); ++i) {
				char c = input.charAt(i);
				if (Character.isUpperCase(c)) {
					c = Character.toLowerCase(c);
				}
				if (countRecord.get(c) != null) {
					countRecord.put(c, countRecord.get(c) + 1);
				} else {
					countRecord.put(c, 1);
				}
			}
		}
		for (int i = 0; i < ALPHABETS.length; i++) {
			if (countRecord.get(ALPHABETS[i]) != null) {
				System.out.println(String.format("%c : %d", ALPHABETS[i],
						countRecord.get(ALPHABETS[i])));
			} else {
				System.out.println(String.format("%c : 0", ALPHABETS[i]));
			}
		}
	}

}
