package myfirstjava;

import java.util.Scanner;

public class palindrom_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number which you need to check palindrom");
		int num= sc.nextInt();
		int original = num;
		
		System.out.println("my first changes.");

		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer reverse= sb.reverse();

		 if (original == num)  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome."); 
	}



	}
	
