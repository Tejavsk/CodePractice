package Package2;

import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter factorial number :");
		int n = sc.nextInt();
		int f=1;
		for (int i=1; i<=n; i++)
		
			f=f*i;
			System.out.println("Factorial of "+n+" is : "+f);
	
	}
}
