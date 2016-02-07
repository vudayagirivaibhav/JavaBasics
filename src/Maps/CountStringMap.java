package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountStringMap {

	public static void main(String[] args) {
		
		 String str = "abraka dabraka abraka dabra";

	        char[] char_array = str.toCharArray();

	      

	    Map<Character, Integer> charCounter = new HashMap<Character, Integer>();

	        for (char i : char_array) {

	    charCounter.put(i,charCounter.get(i) == null ? 1 : charCounter.get(i) + 1);

	        }

	    for (Character key : charCounter.keySet()) {
	  System.out.println("occurrence of '" + key + "' is  "+ charCounter.get(key));
	        }

	    }
	}


