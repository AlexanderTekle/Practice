
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime.isPrime(2)); //true
		System.out.println(isPrime.isPrime(3)); //true
		System.out.println(isPrime.isPrime(5)); //true
		System.out.println(isPrime.isPrime(7)); //true
		System.out.println(isPrime.isPrime(4)); //false
		System.out.println(isPrime.isPrime(99999)); //false







	}

}
