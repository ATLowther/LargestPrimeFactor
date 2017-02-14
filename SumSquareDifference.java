
public class SumSquareDifference {

	public static void main(String[] args) {
		double a = sumOfSquares();
		double b = squareOfSum();
		int c = (int)(b - a);
		System.out.print(c);
		

	}
	
	public static double sumOfSquares() 
	{
		double sum = 0;
		for (int i = 1; i <= 100; i++)
		{
			double b = Math.pow(i, 2);
			sum += b;
		}
		return sum;	
	}
	
	public static double squareOfSum() 
	{
		double sum = 0;
		for (int i = 1; i <= 100; i++)
		{
			sum += i;
		}
		sum = Math.pow(sum, 2);
		return sum;	
	}

}
