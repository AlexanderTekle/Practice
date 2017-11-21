
public class Palindrome {
	
	public static boolean isPalindrome(String str)
	{
		for (int i=0;i<str.length()/2;i++)
		{
			if (str.charAt(i) != str.charAt(str.length()-i-1))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		System.out.println(Palindrome.isPalindrome("hello"));
		System.out.println(Palindrome.isPalindrome("bbaaccbb"));
		System.out.println(Palindrome.isPalindrome("bbaabb"));
		System.out.println(Palindrome.isPalindrome(""));
		System.out.println(Palindrome.isPalindrome(" "));
		System.out.println(Palindrome.isPalindrome("  "));
		System.out.println(Palindrome.isPalindrome("a"));
		System.out.println(Palindrome.isPalindrome("cabbac"));
		System.out.println(Palindrome.isPalindrome("aba"));
		System.out.println(Palindrome.isPalindrome("abcba"));
		System.out.println(Palindrome.isPalindrome("bbaaccbb"));
		System.out.println(Palindrome.isPalindrome("bbaabb"));



	}
	
}
