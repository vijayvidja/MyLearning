package myfirstjava;

import java.util.Scanner;

public class sample2 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = x++ ;
		
		System.out.println("value of x is " + x); // x=2

		System.out.println("value of y is " + y); // y=1
		
		int a =1;
		int b = ++a;
		
		System.out.println("value of a is "+ a); // a=2
		System.out.println("value of b is "+ b); // b=2
		
		/* taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your full name");
		String name= scanner.nextLine();
		System.out.println("your full name is "+ name);  */
		
		// boolean
		int temp = 22 ;
		boolean checkTemp = temp >25 ;
		System.out.println(checkTemp);
		
		boolean hasHighIncome = false ;
		boolean hasGoodCredit = true ;
		boolean hasCriminalCase = false ;
		
		//boolean isEligible = !hasHighIncome && hasGoodCredit;   not operator ! indicate-- reverse result

		
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalCase ;
		
		System.out.println("you are eligiblity status for loan is "+ isEligible);
		
		

	}

}
