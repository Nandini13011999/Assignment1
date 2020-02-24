package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = scan.nextInt();
		String objects[] = new String[n];
		
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++) {
			objects[i]=scan.next();
		}
		
		String sort[]=getAlphabetsSorted(objects);
		
		System.out.println("Sorted elements:\n");
		for(int i=0;i<n;i++)
		System.out.println(sort[i]);

	}
	
	public static String[] getAlphabetsSorted(String object[]) {

		Arrays.sort(object);
		int len=object.length;
		if(len%2==0) {
			
			for(int i=0;i<len/2;i++) {
				object[i]=object[i].toUpperCase();
			}
		}
		else
		{
			for(int i=0;i<len/2+1;i++) {
				object[i]=object[i].toUpperCase();
		}
	
		}
		return object;
		
		
		
	}
	
}