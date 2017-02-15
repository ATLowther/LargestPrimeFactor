
public class HighlyDivisibleTriangularNumber {

	public static void main(String[] args) {	
		
		triangleNumbers();
	}
	
	public static void triangleNumbers() 
	{
		long num = 0;
		for (long triangle = 1; ; triangle++ )
		{
			num += triangle;				
			if (fiveHundredDivisors(num))
			{
				System.out.print(triangle);
				break;
			}			
		}
	}  
	
	public static boolean fiveHundredDivisors(long number)
	{
		int sum = 0;
		for (long x = number; x > 0 && number > 500; x-- )
		{
			if ((number % x == 0) && (sum < 500))
			{
				sum++;
			}
			else if (sum >= 500)
			{
				return true;
			}
		}
		return false;
	}		
}
