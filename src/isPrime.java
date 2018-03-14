
public class isPrime {
	
	public static boolean isPrime(int num)
	{
		if (num==2 || num == 3)
			return true;
		if (num % 2 == 0)
			return false;	
		for (int i=3;i<(int)Math.sqrt(num);i+=2)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	public static int perm(int n, int r)
	{
		int product = 1;
		for (int i=0;i<n;i++)
		{
			product=product*(n-i);
		}
		
		int k=n-r;
		int product2=1;
		for (int i=0;i<k;i++)
		{
			product2 = product2*(k-i);
		}
		
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println(isPrime.isPrime(2)); //true
		System.out.println(isPrime.isPrime(3)); //true
		System.out.println(isPrime.isPrime(5)); //true
		System.out.println(isPrime.isPrime(7)); //true
		System.out.println(isPrime.isPrime(4)); //false
		System.out.println(isPrime.isPrime(99999)); //false*/
		
		System.out.println(isPrime.perm(13, 7));







	}

}
