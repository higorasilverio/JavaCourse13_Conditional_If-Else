package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
				
		System.out.print("Enter the X coordinate: ");
		double x = scanner.nextDouble();
		System.out.print("Enter the Y coordinate: ");
		double y = scanner.nextDouble();
		
		if (x == 0d && y == 0d) System.out.println("Origin!");
		else if (y == 0d) System.out.println("X axis!");
		else if (x == 0d) System.out.println("Y axis!");
		else if (x > 0d && y > 0d) System.out.println("Q1");
		else if (x < 0d && y > 0d) System.out.println("Q2");
		else if (x < 0d && y < 0d) System.out.println("Q3");
		else System.out.println("Q4");
	
		scanner.close();		
	}

}
