package Package2;

public class PrimeNumbers {

	public static void main(String[] args) {
		int n=97;
		int count=0;
		for (int i=2; i<=n/2; i++)
		{
			if (n%i==0)
				
			{
				count=count+1;
			}
			}
			if (count==0)
			{
				System.out.println("n is prime number");
			}
			
			else
			{
				System.out.println("n is not a prime number");
			}
			
		}

	}


