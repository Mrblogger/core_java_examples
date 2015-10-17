/**
 * 
 */
package com.arjunt.core.stringexamples;

import java.util.Scanner;

/**
 * @author arjun
 *
 */
public class ReverseString {
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		// using the java StringBuffer api reverse()
		System.out.println("Reverse String:" + sb.reverse());
		 
		// creating a new StringBuffer object.
		sb = new StringBuffer();
		// looping from the last index to first by decrementing the index value by 1
		for(int i=str.length()-1;i>=0;i--){
			// appending the char value to sb instance.
			sb.append(str.charAt(i));
		}
		System.out.println("Reverse String:" + sb.toString());
		// creating a new string buffer instance to hold the new String.
		sb = new StringBuffer();
		// looping through the beginning of the String.
		for(int i=1;i<=str.length();i++){
			// String length()-1 returns the last index.
			sb.append(str.charAt(str.length()-i));
		}
		System.out.println("Reverse String:" + sb.toString());
	}
	

}
