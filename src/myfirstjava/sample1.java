package myfirstjava;

import java.util.Arrays;

public class sample1 {

	public static void main(String[] args) {
	    
		int salary = 55000 ;
		int otherIncome = 15000 ;
		int total = salary + otherIncome ;
		// final is constant we cannot change this
		final int constantNo = 1000;
		
		double retur = 10.55;
		char singleword = 'A' ;
		String name = "  vijay vidja  ";
		
		// playing with string
		
		System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
		System.out.println("\"Good\" morning");
		System.out.println("hello Hanvika");
		System.out.println("Vijay's monthly salary is " + salary +"and other income is "+ otherIncome);
		System.out.println("vijay's toal salary is "+total);
		// declare array
		
				int[] numbers = new int[3];
				numbers[0]=22;
				numbers[1]=33;
				
				System.out.println(Arrays.toString(numbers));
				// declare multi dimension array
				
				int[][] multiNumbers = new int[2][4];
				multiNumbers[1][2]= 44;
				
				System.out.println(Arrays.deepToString(multiNumbers));
				
		System.out.println(java.time.LocalDateTime.now());  

	}

}
