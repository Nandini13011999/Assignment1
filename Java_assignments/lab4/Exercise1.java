package lab4;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n =scan.nextInt();
		cubeOfDigits(n);
	}
	
	public static void cubeOfDigits(int n) {
		
		int rem;
		int sum=0;
		while(n!=0) {
			rem=n%10;
			sum=rem*rem*rem+sum;
			n=n/10;
			
		}
		
		System.out.println("Sum of cubes of digits = "+sum);
	}

}
