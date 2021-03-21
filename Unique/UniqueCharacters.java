package Unique;

import java.util.*;

/**
 * this class return the number of unique characters in the string 
 * @author yash.porwal_metacube
 *
 */
public class UniqueCharacters {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str;
		System.out.println("Enter the string:- ");
		str=sc.nextLine();
		String[] words = str.split("");

		Set<String> uniqueWords=new HashSet<String>();
		for (String i:words) {
			uniqueWords.add(i);
		}

		System.out.println("The number of unique characters in the string are :- "+uniqueWords.size());
		
	}

}