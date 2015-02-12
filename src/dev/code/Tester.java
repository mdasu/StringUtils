package dev.code;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";

		StringUtils su = new StringUtils();
		s = "Was it Eliot's toilet I saw";
		//s = "A man, a plan, a canal – Panama";
		s = "Doc Note: I dissent. A fast never prevents a fatness. I diet on cod";
		s = "palindromeemordnilap";
		if (su.isPalindrome(s)) {
			System.out.println(s + " is a palindrome!!!");
		} else {
			System.out.println(s
					+ " is not a palindrome.  Please try again...");
		}
	}
}