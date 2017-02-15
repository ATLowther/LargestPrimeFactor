
public class SummationOfPrimes {

	public static void main(String[] args) {
		
		long sum = 0;
		for (int temp = 1; temp < 2000000; temp++)
		{
			if ((isPrime(temp)))
			{
				sum += temp;
			}
		}
		System.out.print(sum);
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
		else if ((temp % 2 == 0) || (temp % 3 == 0))
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
