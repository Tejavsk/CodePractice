package Package2;

import java.util.Scanner;


public class MultiplesOf5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Multiples of 5 upto "+a+" are the below:");
		for (int i=5; i<a; i++)
		{
		if (i%5==0)
		{
			
		System.out.println(i);
		}
		}
	}

}
