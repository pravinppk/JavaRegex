/**
 * 
 */
package com.streamsandlambda.regex.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Praveen
 *
 *In this example I am going to show the basic pattern search using Java Regex
 */
public class BasicRegexExample {


	public static void main(String[] args) {

		//Ball by Ball Score by a Batsman
        String targetString = "1100166620001010644003114";
		
        //Now we need to find whether the batsman scored hatrick six or not
        String hatrickSix="666";
        
        //Create pattern object using search string
        //This is a static factory method
        Pattern pattern = Pattern.compile(hatrickSix);
        //Create matcher object using the target string
        Matcher matcher = pattern.matcher(targetString);
        while(matcher.find()){
        	int ball = matcher.start();
        	//matcher.start(); return the index value. So i have added +1 to count each balls
        	System.out.println("Batsman scored hatrick six on his "+(ball+1)+"th "+(ball+2)+"th and "+(ball+3)+"th"+" balls");
        }
        
	}

}
