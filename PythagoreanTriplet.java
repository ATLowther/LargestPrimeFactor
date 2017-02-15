
public class PythagoreanTriplet {

	public static void main(String[] args) {
		
		double g = pythagoreanTheorem();
		System.out.print((int)g);
		
	}
	
	public static double pythagoreanTheorem()
	{
		for (int a = 1; a < 500; a++ )
		{
			for (int b = 1; b < 500; b++ )
			{
				for (int c = 1; c < 500; c++ )
				{					
					double d = Math.pow(a, 2);
					double e = Math.pow(b, 2);
					double f = Math.pow(c, 2);					
					if (((d + e) == f) && (a + b + c == 1000)) 
					{
						return ((double)a*b*c);
					}
					
				}
			}
		}
		return 0.0;
	}

}
