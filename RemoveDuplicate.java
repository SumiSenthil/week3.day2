package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {
	
		String str="paypal";
		char[] CharArray = str.toCharArray();
		System.out.println("The Lenght of String : " +CharArray.length);
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		for(char eachChar:CharArray)
		{
			if(map.containsKey(eachChar))
				map.put(eachChar,map.get(eachChar)+1);
			else
				map.put(eachChar,1);				
		}
		System.out.println(map);		
}
		

	}


