
public class Fibonacci {

	public static int solve(int k)
	{
		int first = 0;
		int second = 1;
		if (k==1)
			return first;
		if (k==2)
			return second;

		int sum =0;
		for (int i=0;i<k;i++)
		{
			System.out.println(sum);
			sum = first + second;
			first = second;
			second = sum;
		}
		return first;
	}
	
	public static void main(String args[])
	{
		System.out.println(solve(3));
	}
}
