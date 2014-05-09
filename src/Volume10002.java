import java.io.IOException;

public class Volume10002 {

	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader(
                new java.io.InputStreamReader(System.in));
        String input = reader.readLine();
        String array[] = (input.split(" "));
        int height = Integer.parseInt(array[0]);
        int width = Integer.parseInt(array[1]);
        System.out.println(height*width + " " + (height+width)*2);
	}

}
