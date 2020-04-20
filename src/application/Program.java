package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import util.cauculator;

public class Program {	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Informe o raio: ");
		double radius = sc.nextDouble();
		
		double c = cauculator.circumference(radius);		
		double v = cauculator.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", cauculator.PI);	
		
		System.out.println("alteração");
		sc.close();
	}
	
	
}
