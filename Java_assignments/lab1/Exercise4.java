package lab1;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter an natural number:");
		int num=scan.nextInt();
		boolean flag= checkPower(num);
		if(flag==true) {
			System.out.println("NUMBER IS POWER OF 2");
		}
		else
		{
			System.out.println("NUMBER IS NOT POWER OF 2");
		}
	}

	private static boolean checkPower(int num) {
		int flag=0;
		while(num!=0) {
			if(num%2!=0&&num!=1) {
				return false;
			}
			num=num/2;
			
		}
		return true;
	}

}
