package lab6;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = scan.next();
		boolean check =checkString(str);
		if(check == true)
			System.out.println(str+" is a positive string");
		else
			System.out.println(str+" is a negative string");

		
	}
	public static boolean checkString(String str) {
		char ch []=str.toCharArray();
		for(int i=0;i<str.length()-1;i++) {
			if(ch[i+1]<ch[i])
			{
				return false;
			}
		}
		return true;
	}
	

}
