import java.util.*;

/*
 * Find and return the index of first non-repeating character in a string. If all characters are repeating then return -1
Example: geeksforgeeks  returns 5 
        zzzzzzzzzzzzz  returns -1
 */
public class MockInterview {
	 public int solve(String str)
	 {
		 ArrayList[] letters = new ArrayList[128];
		 
		 for (int i=0;i<letters.length;i++)
		 {
			 letters[i]=new ArrayList<Integer>();
		 }
		 
		 for (int i=0;i<str.length();i++)
		 {
			 int val = str.charAt(i);
			 letters[val].add(i);
		 }
		 
		 int index = -1;
		 for (int i=0;i<letters.length;i++)
		 {
			 
			 if (letters[i].size() == 1)
			 {
				 if (index == -1)
					 index = (int) letters[i].get(0);
				 else
				 {
					 if ((int)letters[i].get(0)<index)
					 {
						index = (int)letters[i].get(0); 
					 }
				 }
			 }
		 }
		 return index;
	 }
}
