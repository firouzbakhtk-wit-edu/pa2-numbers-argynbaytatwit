package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: Get 5 integers and output 6 things. 
public class PA2a {

	// TODO: I thought about easier way of inputing here. 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter five whole numbers: ");
		int sum_pos=0, sum_neg=0;
		double inputs;
		double number_pos = 0, number_neg=0;
		for(int i = 0; i<5; i++) {
			inputs = input.nextInt();
			if (inputs > 0) {
				sum_pos += inputs;
				number_pos +=1.0 ;
			}
			else {
				sum_neg += inputs;
				number_neg +=1.0;
			}
		}
		int sum = sum_pos + sum_neg;
		double average = sum/5.0;
		if (sum_neg==0 && sum_pos ==0) {
			System.out.println("The sum of the " + (int)number_pos + " positive numbers: 0");
			System.out.println("The sum of the " + (int)number_neg + " non-positive numbers: 0");
			System.out.println("The sum of the 5 numbers: 0");
			System.out.println("The average of the " + (int)number_pos + " positive numbers: 0.00");
			System.out.println("The average of the " + (int)number_neg + " non-positive numbers: 0.00");
			System.out.println("The average of the 5 numbers: 0.00");
		}
		else if (number_pos ==0) {
			System.out.println("The sum of the " + 0 + " positive numbers: 0");
			System.out.println("The sum of the " + (int)number_neg + " non-positive numbers: " + sum_neg);
			System.out.println("The sum of the 5 numbers: " + (sum_pos + sum_neg));
			System.out.printf("The average of the 0 positive numbers: 0.00\n");
			System.out.printf("The average of the " + (int)number_neg + " non-positive numbers: %.2f\n" + sum_neg/number_neg);
			System.out.printf("The average of the 5 numbers: %.2f\n", average);
		}
		else if (number_neg ==0) {
			System.out.println("The sum of the " + (int)number_pos + " positive numbers: " + sum_pos);
			System.out.println("The sum of the " + 0 + " non-positive numbers: 0");
			System.out.println("The sum of the 5 numbers: " + sum_pos);
			System.out.printf("The average of the " + (int)number_pos + " positive numbers: %.2f\n" , sum_pos/number_pos);
			System.out.printf("The average of the " + 0 + " non-positive numbers: 0.00\n");
			System.out.printf("The average of the 5 numbers: %.2f\n" + sum_pos/5.00);
		}
		else {
			System.out.println("The sum of the " + (int)number_pos + " positive numbers: " + sum_pos);
			System.out.println("The sum of the " + (int)number_neg + " non-positive numbers: " + sum_neg);
			System.out.println("The sum of the 5 numbers: " + sum);
			System.out.printf("The average of the " + (int)number_pos + " positive numbers: %.2f\n" , sum_pos/number_pos);
			System.out.printf("The average of the " + (int)number_neg + " non-positive numbers: %.2f\n" , sum_neg/number_neg);
			System.out.printf("The average of the 5 numbers: %.2f\n" + sum/5.00);}
	}

}
