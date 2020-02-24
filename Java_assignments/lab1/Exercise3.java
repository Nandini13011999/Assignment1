package lab1;

import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		
		boolean check = checkNumber(num);
		if(check)
		{
			System.out.println(num+" is an increasing number");
		}
		else
			
			System.out.println(num+" is not an increasing number");

		
	}
	
	
	static boolean checkNumber(int num) {
		int x[]= new int[20];
		int i=0,j;
		while(num!=0) {
			 x[i]= num%10;
			 num=num/10;
			i++;	
		}
		int flag=0;
		for(i=0;i<x.length-1;i++) {
			j=i+1;
			 flag=0;
			if(x[i]<x[j]) {
				flag=1;
				break;
			}
					
		}
		if(flag==0)
		return true;
		else return false;
		
	}

}




