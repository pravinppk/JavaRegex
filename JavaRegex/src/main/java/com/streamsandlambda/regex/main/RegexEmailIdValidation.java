/**
 * 
 */
package com.streamsandlambda.regex.main;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Praveen
 *
 */
public class RegexEmailIdValidation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Sample Email Id
		String targetString = "streamsandlambda@gmail.com";

		// Now we need to find how many 4s and 6s scored by the batsman
		String regex = "[0-9A-Za-z][a-zA-Z0-9]*@[0-9A-Za-z]+[.][A-Za-z]";

		// Create pattern object using search string
		// This is a static factory method
		Pattern pattern = Pattern.compile(regex);
		// Create matcher object using the target string
		Matcher matcher = pattern.matcher(targetString);

		if (matcher.find()) {
			System.out.println("Valid Email Id");
		} else {
			System.out.println("Invalid Email Id");
		}

	}

}
