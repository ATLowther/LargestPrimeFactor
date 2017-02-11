//Currently not functioning properly. Needs work.

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long check = input.nextLong();
		input.close();
		long checkClone = check;
		if (!(isEven(checkClone)))
		{
			checkClone = setEven(checkClone);
		}
		checkClone /= 2;
		if (isEven(checkClone)) 
		{
			checkClone--;
		}	
		
		long start = 3;
		for(long temp = checkClone; temp > 0; temp -= 2)
		{	
			System.out.println(temp);
			boolean factor = isFactor(check, temp);
			if(!(factor) && !(isFactor(check, start))) 			
			{
				long fix = speedUp(check, start);
				temp = (temp - fix) - 1;				
				if (isEven(temp))
				{
					temp -= 1;
				}
				start += 2;
			}
			else if (factor)
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
		
			
	
	public static boolean isPrime(long x) 
	{
			long total = 0;
			for(long temp = 1; (temp <= x) && !(total >= 3); temp += 2) 
			{
				if (x % temp == 0)
				{
					total += 1;
				}				
			}
			return (total == 2);
						
	}	
	
	public static boolean isFactor(long original, long prime) 
	{
		return (original % prime == 0);
	}
	
	public static boolean isEven(long input) 
	{
		if (!(input % 2 == 0)) 
		{
			return false;
		}
		return true;
	}
	
	public static long setEven(long input) 
	{
		if (!isEven(input))
		{
			return (input + 1);		
		}	
		return input;
	}
	
	public static long speedUp(long original, long tester)
	{
		if (tester == 1)
		{
			tester -= 1;
		}
		long test1 = (original / tester);
		long test2 = (original / (tester + 2));
		return (test2 - (test1 - 1));
		
	}

}
