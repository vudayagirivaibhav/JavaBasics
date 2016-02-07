package Strings;

import java.util.Arrays;

public class Anagram {

	

    public static void main(String[] args) {
        String str1 = "vaibhav";
        String str2 = "vaibhav";
        if (isAnagram(str1, str2)) {
            System.out.println(str2 + " is anagram of " + str1);
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }
    
    
    
    
    
    
	private static boolean isAnagram(String str1, String str2) {
		 
	       
        if (str1.length() != str2.length()) {
            return false;
        }
 
        str1 = sortCharacters(str1);
        str2 = sortCharacters(str2);
 
        return str1.equals(str2);
    }
 
    private static String sortCharacters(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
 
}
