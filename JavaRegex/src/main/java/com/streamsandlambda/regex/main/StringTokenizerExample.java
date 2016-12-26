/**
 * 
 */
package com.streamsandlambda.regex.main;

import java.util.StringTokenizer;

/**
 * @author Praveen
 *
 *In this Example i am going to show how to use StringTokenizer class
 */
public class StringTokenizerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Here i am splitting the Hello World string default split value is \s
		StringTokenizer token1 =  new StringTokenizer("Hello World");
		while(token1.hasMoreElements()){
			System.out.println(token1.nextToken());
		}
		// Here i am splitting the 2016-12-25 string by '-'
				StringTokenizer token2 =  new StringTokenizer("2016-12-25","-");
				while(token2.hasMoreElements()){
					System.out.println(token2.nextToken());
				}
	}

}
