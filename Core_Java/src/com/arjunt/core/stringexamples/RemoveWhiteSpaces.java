/**
 * 
 */
package com.arjunt.core.stringexamples;

import java.util.*;

/**
 * @author arjun
 *
 */
public class RemoveWhiteSpaces {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		// split based on some string reference (whitespace)
		String[] arr = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr.length;i++){
			sb.append(arr[i]);
		}
		System.out.println(sb.toString());
		
		
		// using replace() of String Class
		
		System.out.println(str.replace(" ", ""));
		
		// using replaceAll() of String Class
		System.out.println(str.replaceAll("\\s",""));
		
		// Converting the String to Array of Characters
		char[] chararr = str.toCharArray();
		System.out.println(chararr.length);
		sb = new StringBuffer();
		for(int i=0;i<chararr.length;i++){
			// excluding the whitespaces by not allowing them to be appended  
			if(chararr[i] != ' '){
				sb.append(chararr[i]);
			}
		}
		System.out.println(sb.toString());
		
	}

}
