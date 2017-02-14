import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		double check = input.nextDouble();
		input.close();
		double checkClone = Math.ceil(Math.sqrt(check));
		for (double temp = checkClone; temp > 0; temp--)
		{
		    boolean factor = isFactor(check, temp);
			if (factor)
			{
				boolean prime = isPrime(temp);
				if (prime)
				{
					System.out.println((long)temp);
					break;
				}
			}
			
		}

	}
	
	public static boolean isFactor(double original, double tester) 
	{
		return (original % tester == 0);
	}	
	
	
	public static boolean isPrime(double temp) 
	{
		if (temp <= 1)
		{
			return false;
		}
		else if ((temp == 2) || (temp == 3) || (temp == 5))				
		{
			return true;
		}
		else if ((temp % 2 == 0) || (temp % 3 ==0))
		{
			return false;
		}
		else if (temp % 10 == 5) 
		{
			return false;
		}
		double y = 5.0;
		while ((y * y) <= temp) 
		{			
			if ((temp % y == 0) || (temp % (y + 2) == 0)) 
			{
				return false;
			}
			y += 6;
		}
		return true;
	}
}





