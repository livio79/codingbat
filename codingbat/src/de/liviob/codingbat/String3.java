package de.liviob.codingbat;

import sun.text.normalizer.ReplaceableUCharacterIterator;

public class String3 {
	public int countYZ(String str) {
		if(str.length()<1) return 0;
		str = str.toLowerCase();
		int counter = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(( i+1 == str.length() || !Character.isLetter(str.charAt(i+1 )) ) && (str.charAt(i) == 'y' || str.charAt(i) == 'z'))
				counter++;
 		}
		return counter;
	}
	
	
	// http://codingbat.com/prob/p192570
	public String withoutString(String base, String remove) {
		String word = "";
		for(int i=0; i<base.length(); i++) {
			if(i <= base.length() - remove.length() && base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
				i += remove.length()-1;
			}
			else
				word += base.charAt(i);
		}
		return word;
	}
	
	// http://codingbat.com/prob/p141736
	public boolean equalIsNot(String str) {
		return countOccurence(str, "not") == countOccurence(str, "is");
	}
	
	/**return the numbers of appearances of the String occurence in the String word - case sensitive*/
	public int countOccurence(String word, String occurence) {
		int counter = 0;
		for(int i = 0; i < word.length(); i++) {
			if(i <= word.length() - occurence.length() && word.substring(i, i + occurence.length()).equals(occurence)) {
				++counter;
				i += occurence.length() -1;
			}
		}
		return counter;
	}

	// http://codingbat.com/prob/p198664
	public boolean gHappy(String str) {
		boolean gHappy = true;
		
		  for(int i = 0; i < str.length(); i++) {
			 
			  if(str.charAt(i) == 'g') {
				  if(i !=0 && str.charAt(i - 1) == 'g')
					  	gHappy = true;
				  else if( i != str.length() - 1 && str.charAt(i + 1) == 'g')
						gHappy = true;
				  else 
						return false;
			  }
		  }
		  return gHappy;
	}

	
	// http://codingbat.com/prob/p195714
	public int countTriple(String str) {
		if(str.length() < 3) return 0;
		int countTriple = 0;
		
		for(int i = 0; i < str.length() - 2; i++) {
			 if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) {
				 countTriple++;
			 }
		}
		return countTriple;
		
	}

	 
	
	public static void main(String[] args) {
		String3 word = new String3();
		 
		String a = "abcde";
		
		 
	}

}
