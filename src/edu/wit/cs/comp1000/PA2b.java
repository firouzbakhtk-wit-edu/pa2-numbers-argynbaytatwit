package edu.wit.cs.comp1000;
import java.util.Scanner;

// TODO: Part B: getting coefficients for quadratic equation. Getting out the roots.
public class PA2b {

	// TODO: define the a, b, and c, calculate the Discriminant, and get out the roots as outputs.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		System.out.printf("Enter a b c: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		int d = b*b - 4*a*c;
		double r1= (-b - Math.sqrt(d))/(2*a);
		double r2= (-b + Math.sqrt(d))/(2*a);
		if (d < 0) {
			System.out.println("Roots: imaginary");
		}
		else if(d ==0){
			System.out.printf("Root: %.2f" , (double)(-b/(2*a)) +"%n");
		}
		else {
			System.out.printf("Roots: %.2f", r1);
			System.out.printf(", %.2f", r2);
			System.out.println();
		}
	}

}
