/**
 * 
 */
package com.streamsandlambda.regex.main;

import java.util.regex.Pattern;

/**
 * @author Praveen
 *
 *In this Example i am explaining the  Regex.Split() usage
 */
public class RegexSplitExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String date ="2016-12-25";
		
		//Splitting the date by '-' here im using stream API for iteration
		 Pattern.compile("-").splitAsStream(date).forEach(f-> System.out.println(f));
		
	}

}
