package Package2;

import java.util.Scanner;


public class SwapNumbers {

	public static void main(String[] args) {
		// Swap two numbers using Temp Variable
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = sc.nextInt();
		System.out.println("Enter b value :");
		int b = sc.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
*/
		
		//Swap two number without using Temp variable
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = sc.nextInt();
		System.out.println("Enter b value :");
		int b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a is : "+a);
		System.out.println("Value of b is : "+b);
		
		
	}

}
