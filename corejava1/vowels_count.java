package corejava1;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class vowels_count {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Please enter a String: ");
	        String input = scanner.nextLine();
	        countVowelsAndConsonants(input);
	        scanner.close();
	    }
	    public static void countVowelsAndConsonants(String str) {
	    	Map<Character, Integer> vowelCount = new HashMap<>();
	    	Map<Character, Integer> consonantCount = new HashMap<>();
	    	String vowels = "AEIOU";
	    	String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
	    	for (char ch : str.toUpperCase().toCharArray()) 
	    	{
		    	if (vowels.indexOf(ch) != -1) 
		    	{
			    	vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);
			    }
		    	else if (consonants.indexOf(ch) != -1) 
		    	{
		    	consonantCount.put(ch, consonantCount.getOrDefault(ch, 0) + 1);
		    	}
	    	}
	    	
	    	System.out.println("Vowels:");
	    	for (Map.Entry<Character, Integer> entry : vowelCount.entrySet()) 
	    	{
	    	System.out.println(entry.getKey() + " - " + entry.getValue());
	    	}
	    	System.out.println("\nConsonants:");
	    	for (Map.Entry<Character, Integer> entry : consonantCount.entrySet()) 
	    	{
	    	System.out.println(entry.getKey() + " - " + entry.getValue());
	    	}
	    }
}
	    	
	    

	    