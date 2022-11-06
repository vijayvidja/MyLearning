package myfirstjava;

import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ; // create object of scanner class to take input from user
		
		System.out.println("please enter your magic number :: ");
		
		int number = sc.nextInt() ;
		
	/*	int a= number%10; // this will give last digit
		int b = number/10; // this will eliminate last digit
		
		System.out.println("your number is " +a); // expected a= 8
		System.out.println("your number is " +b); // expected b = 5467 */
		
		// using stringbuffer class
		/*
		StringBuffer sb = new StringBuffer(String.valueOf(number)) ;
		StringBuffer reverse = sb.reverse() ;
		
		System.out.println("your reverse output is " +reverse);
		System.out.println("thank you !"); */

		// how to reverse numbers or string -- using StringBuffer class we can achieve that
		
		StringBuffer sb1 = new StringBuffer(String.valueOf(number));
		StringBuffer rev = sb1.reverse() ;
		System.out.println("your reverse number is" +rev);
		
		
		
	}

}
