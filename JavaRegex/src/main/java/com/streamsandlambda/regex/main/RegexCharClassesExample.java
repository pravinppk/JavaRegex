/**
 * 
 */
package com.streamsandlambda.regex.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Praveen
 *
 *In this example we are going to see how to find pattern using character classes
 */
public class RegexCharClassesExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Ball by Ball Score by a Batsman
        String targetString = "1100166620001010644003114";
		
        
		//Now we need to find how many 4s and 6s scored by the batsman
        String sixesAndFours="[64]";
        
    	//Now we need to find how non boundaries and sixes scored by the batsman
       // String nonBoundaries="[^64]";
        
        //Create pattern object using search string
        //This is a static factory method
        Pattern pattern = Pattern.compile(sixesAndFours);
        //Create matcher object using the target string
        Matcher matcher = pattern.matcher(targetString);
        int sixers=0;
        int fours=0;
        while(matcher.find()){
        	if(matcher.group().equals("6")){
        		sixers++;
        	}else{
        		fours++;
        	}
        }
        
    	System.out.println("No of sixes scored - "+sixers);
    	System.out.println("No of boundaries scored - "+fours);


	}

}
