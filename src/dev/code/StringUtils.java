package dev.code;

import java.lang.reflect.Method;

import javax.print.attribute.standard.Chromaticity;

public class StringUtils {

	public static char getChar(String s, int pos) {
		char chr = '\0';
		chr = s.charAt(pos);
		return chr;
	}

	public static boolean isPalindrome(String s) {
		String palindrome = "";
		String newStr = "";
		boolean isPalindrome = false;
		char chrF = '\0'; // forward
		char chrB = '\0'; // backward
		int k = 0, breakPos = 0, remainder = 0;
		boolean isEven = false; 

		newStr = s.replaceAll("\\W", "");
		newStr = newStr.toLowerCase();
		k = newStr.length() - 1;
		
		// If even number of chars, then palindrome must be split down middle
		if (newStr.length() % 2 == 0) {
			isEven = true;
			breakPos = k / 2;
		}

		System.out.println("New string is: " + newStr);

		for (int i = 0; i < newStr.length(); i++) {
			chrF = getChar(newStr, i);
			chrB = getChar(newStr, k);
			if (chrF != chrB) {
				/*System.out.println("i is: " + i + " k is: " + k + " chrF "
						+ chrF + " chrB " + chrB);
				System.out.println("Err2 " + s 
						+ " is not a palindrome!  Try again...");  */
				isPalindrome = false;
				break;
			}
			isPalindrome = true;  // will be set to false if not true so okay to always set here
			// check before k is decremented
			if (isEven && k == breakPos) {
				break;
			}
			k--; // decrement k every loop
		}
		return isPalindrome;
	}
	// Recursive method
	public static boolean isPalindromeR(String s) {
		String palindrome = "";
		String newStr = "";
		boolean isPalindrome = false;
		char chrF = '\0'; // forward
		char chrB = '\0'; // backward
		int k = 0, breakPos = 0, remainder = 0;
		boolean isEven = false; 

		newStr = s.replaceAll("\\W", "");
		newStr = newStr.toLowerCase();
		k = newStr.length() - 1;
		
		// If even number of chars, then palindrome must be split down middle
		if (newStr.length() % 2 == 0) {
			isEven = true;
			breakPos = k / 2;
		}

		System.out.println("New string is: " + newStr);

		for (int i = 0; i < newStr.length(); i++) {
			chrF = getChar(newStr, i);
			chrB = getChar(newStr, k);
			if (chrF != chrB) {
				/*System.out.println("i is: " + i + " k is: " + k + " chrF "
						+ chrF + " chrB " + chrB);
				System.out.println("Err2 " + s 
						+ " is not a palindrome!  Try again...");  */
				isPalindrome = false;
				break;
			}
			isPalindrome = true;  // will be set to false if not true so okay to always set here
			// check before k is decremented
			if (isEven && k == breakPos) {
				break;
			}
			k--; // decrement k every loop
		}
		return isPalindrome;
	}
}
