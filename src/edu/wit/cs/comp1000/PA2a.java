package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: Get 5 integers and output 6 things. 
public class PA2a {

	// TODO: I thought about easier way of inputing here. 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 integers: ");
		int sum_pos=0, sum_neg=0;
		int inputs;
		double number_pos = 0.00, number_neg=0.00;
		for(int i = 0; i<5; i++) {
			inputs = input.nextInt();
			if (inputs > 0) {
				sum_pos += inputs;
				number_pos +=1 ;
			}
			else {
				sum_neg += inputs;
				number_neg +=1;
			}
		}
		System.out.println("The sum of all of the positive numbers: " + sum_pos);
		System.out.println("The sum of all of the non-positive numbers: " + sum_neg);
		System.out.println("The sum of all five numbers: " + (sum_pos + sum_neg));
		System.out.println("The average of all of the positive numbers: " + sum_pos/number_pos);
		System.out.println("The average of all of the non-positive numbers: " + sum_neg/number_neg);
		System.out.println("The average of all five numbers: " + (sum_pos + sum_neg)/5.00);
	}

}
