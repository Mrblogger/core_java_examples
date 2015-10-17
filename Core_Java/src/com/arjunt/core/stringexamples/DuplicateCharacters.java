/**
 * 
 */
package com.arjunt.core.stringexamples;

import java.util.*;

/**
 * @author arjun
 *
 */
public class DuplicateCharacters {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the String here:");
		String str = sc.nextLine();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		// converting the string to character array
		char[] charr = str.toCharArray();
		// using for each loop to iterate through the array. 
		for(char c: charr){
			// check if map contains the key 
			if(map.containsKey(c)){
				// update the key value by adding 1
				map.put(c, map.get(c)+1);
			}else{
				// place the entry in to the map.
				map.put(c, 1);
			}
		}
		// returns the set of keys in the map.
		Set<Character> keys = map.keySet();
		// iterate through the set
		for(char key: keys){
			// if value/count is greater than 1, it is a duplicate entry.
			if(map.get(key)>1){
				System.out.println("Key is " + key + "Value is "+map.get(key));
			}
		}
	}

}
