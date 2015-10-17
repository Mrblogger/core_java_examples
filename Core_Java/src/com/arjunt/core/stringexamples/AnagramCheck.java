/**
 * 
 */
package com.arjunt.core.stringexamples;

import java.util.*;
/**
 * @author arjun
 *
 */
public class AnagramCheck {
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String:");
		String str1 = sc.nextLine();
		System.out.println("Enter the Second String:");
		String str2 = sc.nextLine();
		// Removing the whitespaces from both the Strings.
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		//check the string length
		if(str1.length() != str2.length()){
			System.out.println("They are not Anagrams because they are not of same size");
			return;
		}
		// converting the Strings to Char arrays.
		char[] charr1 = str1.toCharArray();
		char[] charr2 = str2.toCharArray();
		
		// Sort the Arrays using the sort()
		Arrays.sort(charr1);
		Arrays.sort(charr2);
		
		// check whether both the arrays are equal.
			
		for(int i=0;i<charr1.length;i++){
				if(charr1[i] == charr2[i]){
					continue;
				}else{
					System.out.println("Not an Anagram");
					return;
				}
		}
		
		System.out.println("They are Anagram");
			
		
	}

}
