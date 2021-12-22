import java.io.*;
import java.util.*;

public class TwoDArray {
	public static void main(String[] args);

	Scanner scan = new Scanner(System.in);
	PrintStream print = new PrintStream(System.out);
	
	public void IntTwoArray(int m, int n) {
		int[][] array = new int[m][n]; 		
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" Please enter value: ");
				array[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(" The array: ");
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				print.print(" " + array[i][j]);
			}
			System.out.println();
		}
	}

public void DoubleTwoArray(int m, int n) {
		double[][] array = new double[m][n]; 		
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" Please enter value: ");
				array[i][j] = scan.nextDouble();
			}
		}
		
   }
}