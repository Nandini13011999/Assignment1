package lab3;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = scan.nextInt();
		char x[] = new char[n];

		System.out.println("Enter characters : ");
		for (int i = 0; i < n; i++) {
			x[i] = scan.next().charAt(0);
		}

		countChar(x);

	}

	public static void countChar(char y[]) {

		char x[] = new char[y.length];
		int count1[] = new int[y.length];
		
		x[0]='\0';
		int k = 0,flag=0;
		int len = y.length;
		
		for (int i = 0; i < len; i++) {
			char a = y[i];
			flag=0;
			for(int p=0;p<i+1;p++) {
			if(a==x[p]) {
				flag=1;
				break;
			}
			}
			if(flag==0) {
			int count = 1;
			for (int j = i + 1; j < len; j++) {

				if (a == y[j]) {
					count++;
				}

			}
			count1[k]=count;
			
			x[k]=a;
			k++;
			}
		}
		
		for(int i=0;i<k;i++) {
		System.out.println(x[i] + " occurs " + count1[i] + " times");
		}
		
	}
}