package myfirstjava;

public class interviewpractice_swapping {

	public static void main(String[] args) {

		int a = 10 ;
		int b = 20 ;
		
System.out.println("before swapping number is" +a);		
/*
//logic1 with 3rd variable

 int t=a ;
  a=b;
  b=t;
  
  System.out.println("after swapping value of a " + a);
  System.out.println("after swapping value of b "+ b);
  //-----------------
  
  int x= 30;
  int y= 50;
  
  System.out.println("before swapping value of x " +x);
  
  int z = x ;
  x=y ;
  y=z;
  
  System.out.println("after swapping value of x will be "+x);
  System.out.println("after swapping value of y will be "+y);  

  // logic 2 without 3 variable
  
  a = a+b ; // 10+20 = 30
  b= a-b; // 30-20 = 10
  a= a-b; // 30-10 = 20
  
  System.out.println("after swapping withour 3rd variable value of a " +a);
  System.out.println("after swapping withour 3rd variable value of b " +b);  
  
  // logic 3 withour 3rd variable but * and / operator
  
  a= a*b ;// 10*20 = 200
  b= a/b ; //200/20 = 10
  a= a/b; //200/10  = 20
  
  System.out.println("after swapping value of a will be " +a);
  System.out.println("after swapping value of b will be " +b);*/
  
  // logic 4 -- with singline statment only
  
  b = a + b -(a=b) ;
  // it will start from right to left <---- so b=20 assign to a
  // b = 10+20-(20) ==> 30-20 ==> 10

  System.out.println("after swapping value of a will be " +a);
  System.out.println("after swapping value of b will be " +b);

  
  
  

	}

}
