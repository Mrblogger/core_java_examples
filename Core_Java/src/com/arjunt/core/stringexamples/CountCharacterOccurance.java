/**
 * 
 */
package com.arjunt.core.stringexamples;

import java.util.Scanner;

/**
 * @author arjun
 *
 */
public class CountCharacterOccurance {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scanner.nextLine();
		StringBuilder result = new StringBuilder();
		while(str.length() >= 1){
			int count = 0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(0) == str.charAt(i)){
					count++;
				}
			}
			result = result.append(str.charAt(0)+"="+ count+"\n");
			StringBuilder minifiedString = new StringBuilder();
			String[] s = str.split(str.charAt(0)+"");
			for(int j=0;j<s.length;j++){
				minifiedString.append(s[j]);
			}
			str = minifiedString.toString();
		}
		System.out.println(result);
		
	}
	

}
