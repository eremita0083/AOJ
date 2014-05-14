import java.util.Scanner;


public class Volume10024 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double disX =Math.abs(x2 - x1);
		double disY =Math.abs(y2 - y1);
		System.out.println(Math.sqrt(Math.pow(disX, 2) + Math.pow(disY, 2)) +"");
	}

}
