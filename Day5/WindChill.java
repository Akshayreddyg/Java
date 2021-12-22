import java.util.*;
 class WindChill {
	 static void windChill(double f, double ws) {
		double windchill= 35.74 + 0.62158 * f + (0.4275 * f - 35.75) * Math.pow(ws, 0.16);
		System.out.println("windchill :"+windchill);
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter temperature in fahrenheit");
			double f = sc.nextDouble();
			System.out.println("enter wind speed in miles per hour");
			double ws = sc.nextDouble();
			if (Math.abs(f) > 50 || ws > 120 || ws < 3) {
				System.out.println("enter correct input");
			}else {
				windChill(f, ws);
			}
			sc.close();
		}catch(Exception e) {
			System.out.println("enter proper input");
		}
	}

			
}