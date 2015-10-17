/**
 * 
 */
package com.arjunt.core.stringexamples;

import java.io.*;
import java.util.*;

/**
 * @author arjun
 *
 */
public class DuplicateWordsInString {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = br.readLine();
		if(str.length()<=1){
			System.out.println("No input provided");
			return;
		}
		String[] strarr = str.split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(String s:strarr){
			if(map.containsKey(s)){
				map.put(s, map.get(s)+1);
			}else{
				map.put(s, 1);
			}
		}
		Set<String> keys = map.keySet();
		for(String key:keys){
			if(map.get(key) > 1){
				System.out.println("No of times " + "\"" +key+ "\""+ " appeared is:" +map.get(key));
			}else{
				System.out.println("No duplicate words found");
				return;
			}
		}
		
	}
	

}
