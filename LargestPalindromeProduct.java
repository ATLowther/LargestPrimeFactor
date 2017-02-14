import java.util.*;

public class LargestPalindromeProduct {

	public static void main(String[] args) {
		
		int test = 12;
		while (!(isPalindrome(test))) 
		{
			test = threeDigitProduct();
		}
		System.out.print(test); 
		

	}
	
	public static int isLargest(int tester, int tester2)
	{
		if (tester < 999)
		{
			tester += 1;
		}
		if (tester2 < 999)
		{
			tester2 += 1;
		}
		List<Integer> palin = new ArrayList<Integer>();
		for (int a = tester; a < 1000; a++) 
		{
			for (int b = tester2; b < 1000; b++)
			{
				int c = b * a;
				if (isPalindrome(c))
				{
					palin.add(c);					
				}
			}
		}
		System.out.print(palin.size());
		int d = palin.get(palin.size() - 1);	
		return d;
	}
	
	
	
	public static int threeDigitProduct() 
	{
		for (int x = 999; x > 0; x--) 
		{
			for (int y = 999; y > 0; y--) 
			{
				int z = y * x;
				if (isPalindrome(z))
				{
					int k = (isLargest(y, x));		
					return k;
				}
			}
		}	
		return 0;
	}
	
	public static boolean isPalindrome (int test) 
	{
		int temp = test;
		int reverse = 0;
		while (temp != 0) 
		{
			reverse *= 10;
			reverse += (temp % 10);	
			temp /= 10;

		}
		if (!(reverse == test))
		{
			return false;
		}
		return true;
	}

}
