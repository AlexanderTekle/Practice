//Find and return the index of first non-repeating character in a string. 
//If all characters are repeating then return -1
import java.util.*;

public class Mock {
	
	public int getChar(String word)
	{
		ArrayList<ArrayList<Integer>> letters = new ArrayList<>();
		//List[] letters = new int[256];
		
		for (int i = 0; i<256; i++)
		{
			letters.add(new ArrayList<Integer>());
		}

		for (int i =0;i<word.length();i++)
		{
			int val = word.charAt(i);
			letters.get(val).add(i);
			//letters[val].add(i);
		}
	
		int index = 0;
		int count = 0;
		for (int i=0;i<letters.size();i++)
		{
			if (letters.get(i).size() % 2 == 1)
			{	if (count == 0) {
					index = letters.get(i).get(0);
					count++;
				}
				else {
					if (letters.get(i).get(0) < index)
						index = letters.get(i).get(0);
				}
			}
		}
		return index;

	}
	
	public static void main(String args[])
	{
		Mock M = new Mock();
		System.out.println(M.getChar("geeksforgeeksfors"));
	}

}
