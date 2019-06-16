package Package2;

import java.util.Scanner;


public class NumbersBetween {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		//System.out.println(sc);
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		for (int i=a; i<=b; i++)
			System.out.println(i);
		

	}

}
