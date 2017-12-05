
public class QuickSort {
	public int[] arr;
	public QuickSort(int[] arr)
	{
		this.arr = arr;
		SolveQuickSort(this.arr, 0, this.arr.length-1);

	}
	
	public void SolveQuickSort(int[] arr, int low, int high)
	{
		if (low < high) {
			int pivot = partition(this.arr, low, high);
			SolveQuickSort(this.arr, low, pivot-1);
			SolveQuickSort(this.arr, pivot+1, this.arr.length-1);
		}
	}
	
	public int partition(int[] arr, int low, int high)
	{
		int i=low-1;
		for (int j=low; j<high; j++)
		{
			if (arr[j] <= arr[high])
			{
				i++;
				//swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		//swap the pivot
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[] {5,8,11,4,2,9};
		QuickSort x = new QuickSort(test);
		
		for (int i : x.arr)
		{
			System.out.print(i + " ");
		}
		
		//System.out.println("hello".compareTo("haa"));
		//System.out.println(0 / 3);
	}

}
