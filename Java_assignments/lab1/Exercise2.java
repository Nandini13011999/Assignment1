package lab1;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter an natural number:");
		int num=scan.nextInt();
		int sum = calculateDifference(num);
		System.out.println("DIFFERENCE:- "+sum);
		
	}

	private static int calculateDifference(int x) {
		int sum=0,sum1=0;
		for(int j=1;j<=x;j++) {
			sum=sum+j;
		}
		sum=sum*sum;
		for(int j=1;j<=x;j++) {
			sum1=j*j+sum1;
		}
		if(sum>sum1)
		{
		return sum-sum1;
		}
		else
		return sum1-sum;
	}

}
