package de.liviob.codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


//http://codingbat.com/java/AP-1
public class AP1 {
	
	// http://codingbat.com/prob/p146974
	public boolean scoresIncreasing(int[] scores) {
		  for (int i = 0; i < scores.length-1; i++) {
			  if(scores[i]>scores[i+1])
				  return false;
		}
		  return true;
	}

	// http://codingbat.com/prob/p179487
	public boolean scores100(int[] scores) {
		if(scores.length<2) return false;
		for (int i = 0; i < scores.length-1; i++) {
			if(scores[i]==100 && scores[i+1]==100)
				return true;
		}
		return false;
	}

	// http://codingbat.com/prob/p194530
	public boolean scoresClump(int[] scores) {
		for (int i = 0; i < scores.length-2; i++) {
			if(scores[i+2]-scores[i]<=2)
				return true;
		}
		return false;
	}

	// http://codingbat.com/prob/p123837
	public int scoresAverage(int[] scores) {
		int l = scores.length;
		int avLeft =average(scores, 0,l/2);
		int avRight = average(scores, l/2,l);
		return avLeft>avRight ? avLeft : avRight;
	}
	
	// helper method for scoresAverage
	public int average(int [] scores, int start, int end) {
		int sum = 0;
		for(int i= start; i<end; i++) {
			sum += scores[i];
		}
		return sum/(end-start);
	}
	
	// http://codingbat.com/prob/p123837
	public int scoreAverage2(int []scores) {
		int l = scores.length/2;
		int sumL = 0;
		int sumR = 0;
		for (int i = 0; i < l; i++) {
			sumL += scores[i];
			sumR += scores[i+l];
		}
		return sumL>sumR? sumL/l : sumR/l;
	}
	
	
	// http://codingbat.com/prob/p124620
	public int wordsCount(String[] words, int len) {
		  int count =0;
		  for (int i= 0; i < words.length; i++) {
			if(words[i].length()==len)
				count++;
		}
		  return count;
	}
	
	// http://codingbat.com/prob/p183837
	public String[] wordsFront(String[] words, int n) {
		String []words2 = new String [n];
		  for (int i = 0; i < n; i++) {
			words2[i]=words[i];
		}
			return words2;
	}
	
	
	// http://codingbat.com/prob/p183407
	public List wordsWithoutList(String[] words, int len) {
		  List<String>words2 = new ArrayList<>();
		  for (int i = 0; i < words.length; i++) {
			if(words[i].length()!=len)
				words2.add(words[i]);
		}
		  return words2;
	}
	
	// http://codingbat.com/prob/p183407 Wuthout List
	public List wordsWithoutList2(String[] words, int len) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if(words[i].length()==len)
				count++;
		}
		String[] words2 = new String[words.length-count];
		int j=0;
		for (int i = 0; i < words.length; i++) {
			if(words[i].length()!=len) {
				words2[j]= words[i];
				++j;
			}	
		}
		return Arrays.asList(words2);
	}

	// http://codingbat.com/prob/p191212
	public boolean hasOne(int n) {
		 while(n>0) {
			 if(n%10==1)
				 return true;
			 n /=10;
		 }
		 return false;
	}
	
	// http://codingbat.com/prob/p165941
	public boolean dividesSelf(int n) {
		int tmp = n;
	    if(n%10 == 0)
	    	return false;
	    while(n > 0) {
	        if(tmp % (n%10) != 0)
	        	return false;
	        n/=10;
	        }
	    return true;
	}
	
	//http://codingbat.com/prob/p134174
	public int[] copyEvens(int[] nums, int count) {
		count = count > nums.length ? nums.length : count; 
		int [] even = new int[count]; 
		
		  for(int i=0, counter=0; i<nums.length && counter<count; i++) { 
			  if(  nums[i]%2==0) {
				even[counter]= nums[i];
				++counter;
			  }
		  }
		  return even;
	}
	
	//http://codingbat.com/prob/p130124
	public int[] copyEndy(int[] nums, int count) {
		int [] endy = new int [count];
		
		for(int i = 0, counter = 0; i< nums.length && counter < count; i++) {
			if(isEndy(nums[i])) {
				endy[counter] = nums[i];
				++counter;
			}
		}
		return endy;	  
	}
	
	/**return true if n is between 0 and 10 oder between 90 and 100 inclusive*/
	public boolean isEndy(int n) {
		if((n >= 0 && n <= 10) || (n >= 90 && n <= 100) )
			return true;
		return false;
	}
	
	// http://codingbat.com/prob/p139677
	public int matchUp(String[] a, String[] b) {
		  int counter = 0;
		  for(int i = 0; i < a.length; i++) {
			  if(a[i].length()>0 && b[i].length()>0 && a[i].charAt(0) == b[i].charAt(0))
				  ++counter;
		  }
		  return counter;
	}
	
	
	// http://codingbat.com/prob/p180365
	public int scoreUp(String[] key, String[] answers) {
		int score = 0;
		
		for(int i = 0; i < key.length; i++) {
			if(key[i].equals(answers[i]))
				score += 4;
			else if(!answers[i].equals("?"))
				score--;
		}
		return score;
	}

	
	// http://codingbat.com/prob/p121236
	public String[] wordsWithout(String[] words, String target) {
		int counter = 0;
		
		for(int i = 0; i < words.length; i++) {
			if(!words[i].equals(target))
				++counter;
		}
		
		String [] newWords = new String[ counter];
		
		for(int i = 0, j = 0; i < words.length && j < counter; i++) {
			if(!words[i].equals(target)) {
				newWords[j] = words[i];
				++j;
			}
		}
		return newWords;
	}


	
	
	public static void main(String[] args) {
		AP1 a = new AP1();
		int [] nums = {3, 2, 4, 5, 8};
		
		int [] even = a.copyEndy(nums, 2);
		
		
		for(int t: even)
			System.out.println(t);
		
	}

}
