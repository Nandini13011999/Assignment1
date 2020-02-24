package lab1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String []args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter an natural number:");
		int num=scan.nextInt();
		int sum =calculateSum(num);
		System.out.println("SUM IS:"+sum);
		
	}

	private static int calculateSum(int i) {
		int sum=0;
		int count=0;
		for(int j=1;j<=Integer.MAX_VALUE;j++) {
			if(j%3==0||j%5==0) {
				sum=sum+j;
				count++;
				if(count==i)
					break;
			}
		}
		return sum;
		
	}
}

