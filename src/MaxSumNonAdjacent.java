
public class MaxSumNonAdjacent {
	
	public static int solution(int[] nums)
	{
		int sum = nums[0] + nums[2];
		for (int i=0;i<nums.length;i++)
		{
			for (int q=i+2;q<nums.length;q++)
			{
				if (nums[i] + nums[q] > sum)
					sum = nums[i]+nums[q];
			}
		}
		return sum;
	}

	public static void main(String args[])
	{
		int[] test1 = new int[] {1,3,7,4,8,10}; //print 17
		int[] test2 = new int[] {1,3,7}; //print 8
		System.out.println(solution(test1));
		System.out.println(solution(test2));

	}
}
