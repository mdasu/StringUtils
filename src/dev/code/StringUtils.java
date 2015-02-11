package dev.code;

import java.lang.reflect.Method;

import javax.print.attribute.standard.Chromaticity;

public class StringUtils {

	public static char getChar(String s, int pos) {
		char chr = '\0';
		chr = s.charAt(pos);
		return chr;
	}

	public static String makePalindrome(String s) {
		String palindrome = "";
		String newStr = "";
		char firstLtr = '\0';
		char lastLtr = '\0';

		newStr = s.replaceAll("\\W", "");
		System.out.println("New string is: " + newStr);

		// Get first character
		firstLtr = getChar(newStr, 0);
		lastLtr = getChar(newStr, newStr.length() - 1);

		System.out.println("Firt char is: " + firstLtr + " last letter is: "
				+ lastLtr);

		return palindrome;
	}

	public static boolean isPalindrome(String s) {
		String palindrome = "";
		String newStr = "";
		boolean isPalindrome = false;
		char chrF = '\0'; // forward
		char chrB = '\0'; // backward
		int k;
		int breakPos = 0;
		int remainder = 0;
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
				System.out.println("Break");
				break;
			}
			System.out.println("here");
			k--; // decrement k every loop
		}
		return isPalindrome;
	}
}
