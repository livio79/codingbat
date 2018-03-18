package de.livio.codingbat;

public class Array3 {
	
	
	public int maxMirror(int[] nums) {
		int max = 0;
		  for(int i=0; i<nums.length; i++) {
			  int count =0;
			  for(int j=nums.length-1; j>=i; j--) {
				  if(nums[i]==nums[j]) {
					  int tmpI=i;
					  int tmpJ=j;
					  while(tmpI<nums.length && tmpJ>=0 && nums[tmpI]==nums[tmpJ]) {
					  	++count;
						  ++tmpI;
						  --tmpJ;
						  if(count>max) {
							  max = count;
							  
						  }
					  }
				  }
			  }
		  }
		  return max;
		}
	
	
	public int countClumps2(int[] nums) {
		int clumps = 0;
		
		for(int i=0; i<nums.length-1; i++) {
			int count = 0;
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]==nums[j]) {
					++count;
				}
				if(count>0) {
					clumps++;
				}
			}
			i +=count;
		}
		return clumps;
	}
	
	
	public static int countClumps(int[] nums) {
		int clumps = 0;
		int count = 0;
		 
			for(int i=0, j=i+1; j<nums.length; j++) {
				 
				if(nums[i]==nums[j]) {
					++count;  
				} else {
					i=j;
					if(count>0) {
						++clumps; 
						count=0;
						}
					} 
				if(j==nums.length-1 && count>0) 
					++clumps;
				}
				return clumps;
			}
			 
		
		
	public static void main(String[] args) {
		
		
	}
}
