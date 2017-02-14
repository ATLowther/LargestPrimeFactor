
public class TenThousandAndFirstPrime {

	public static void main(String[] args) {
		
		int sum = 0;
		for(long x = 1; ; x++)
		{
			if (isPrime(x))
			{
				if (!(sum == 10000))
				{
					System.out.println(x);
					sum++;
				}				
				else
				{
					System.out.println(x);
					break;
				}
			}
		}

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
