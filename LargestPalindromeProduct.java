import java.util.Scanner;

public class LargestPalindromeProduct {

	public static void main(String[] args) {
		
		int test = 12;
		while (!(isPalindrome(test))) 
		{
			test = threeDigitProduct();
		}
		System.out.print(test); 
		

	}
	
	public static int threeDigitProduct() 
	{
		for (int x = 999; x > 0; x--) 
		{
			for (int y = 999; y > 0; y--) 
			{
				return ((int)x * y);
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
