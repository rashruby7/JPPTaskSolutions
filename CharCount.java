package Jpptaskperform;

import java.util.HashMap;
import java.util.Map;

//How to count occurance of each character in string

//output expected : Jpp -> j=1,p=2 likewise
//hashmap stores unique value in key-value pair format 
public class CharCount {

	public static void getCharCount(String name)
	{
		//we need to take key as character and occurance will be in integer
		
		Map<Character,Integer> charMap=new HashMap<Character,Integer>();
		
		//to convert string into chararray to retrieve each character
		char strArray[]=name.toCharArray();
		
		//to iterate each character and get occurance count
		for(char c:strArray)
		{
			//if map already contatins character c then add the count else update final count
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
			}
			else
			{
				charMap.put(c, 1);
			}
		}
		
		System.out.println(name+":"+charMap);
	}
	public static void main(String[] args) {
		
		//calling the method to perform logic
		getCharCount("Jpp Technologies"); //spaces also get counted
		getCharCount("technologies");
		getCharCount("Jpp");
		getCharCount("J");
	}
}
