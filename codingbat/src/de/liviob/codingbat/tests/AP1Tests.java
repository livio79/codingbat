package de.liviob.codingbat.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import de.liviob.codingbat.AP1;


public class AP1Tests {
	AP1 ap1 = new AP1();
	  
	@Test
	public void testScoresIncreasing() { 
		 assertTrue(ap1.scoresIncreasing(new int[] {0,0}));
		 assertTrue(ap1.scoresIncreasing(new int[] {-2,0,0,2}));
		 assertTrue(ap1.scoresIncreasing(new int[] {1,3,5}));
		 assertFalse(ap1.scoresIncreasing(new int[] {1,3,2,3}));  
	}
	
	
	@Test
	public void testScores100() { 
		 assertTrue(ap1.scores100(new int[] {100,0,100,100}));
		 assertTrue(ap1.scores100(new int[] {0,10,100,100}));  
		 assertFalse(ap1.scores100(new int[] {100,0,100}));
	}


}
