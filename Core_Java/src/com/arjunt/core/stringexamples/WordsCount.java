/**
 * 
 */
package com.arjunt.core.stringexamples;

import java.util.Scanner;

/**
 * @author arjun
 *
 */
public class WordsCount {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = scanner.nextLine();
		String[] arr = str.trim().split(" ");
		System.out.println("Total no of words in the String: "+arr.length);
		
		// with out using split method.
		int count = 1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
				count++;
			}
		}
		System.out.println("Total no of words in the String: "+count);
		
	}

}
