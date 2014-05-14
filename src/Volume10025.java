import java.util.Scanner;


public class Volume10025 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d, s, l, h;
		d =  Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c)));
		l = a + b + d;
		double helon = l / 2;
		s = Math.sqrt(helon * (helon - a) * (helon - b) * (helon - d)); 
//		s = (a*b*Math.sin(Math.toRadians(c)))/2;
		h = s * 2 / a; 
		System.out.println(s);
		System.out.println(l);
		System.out.println(h);
	}

}
