
public class FindMissingNumber {
	
	public static int solve(int[] arr)
	{
		int XOR=0;
		//XOR each number and whatever remains is the answer		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]!=0)
			{
				XOR ^= arr[i];
			}
		}
		return XOR;
	}
	
	public static void main(String arg[])
	{
		System.out.println(FindMissingNumber.solve(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13})); 
	}

}
