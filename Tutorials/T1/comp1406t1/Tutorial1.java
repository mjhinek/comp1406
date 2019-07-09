package comp1406t1;

import java.util.Arrays;  // helper functions for arrays

public class Tutorial1{


        // method  evens : int[] -> int[]
	// preconditions : nums is an array of zero or more integers
	// postconditions: o) returns a new array that has all the even numbers 
	//                    in the input nums. 
	//                 o) the ordering of the numbers in the output must be 
	//                    the same as in nums
	//                 o) the length of the returned array
	//                    will satisfy 0 <= length <= nums.length
	//
	// example: if nums is [2,3,4,5,6,2] 
	//          then evens(nums) ->  [2,4,6,2] 
	//          (with the numbers in any order)
	public static int[] evens(int[] nums){
	
		return null;
	}


	
	/* the main method is the "program"              */
	/* this is what is executed when we run the code */
	public static void main(String[] args){
		
		// array of integers (declaration and initialization)
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println("nums = " + Arrays.toString(nums) );
		
		// array to hold 5 integers
		int[] first = new int[5];
		System.out.println("first (before) = " + Arrays.toString(first) );
		
		// add code to copy the first 5 elements of nums into first 
		
		System.out.println("first (after)  = " + Arrays.toString(first) );
		
		// add code to the evens() function so that when you pass
		// nums as input it returns the correct array
		
		int[] second = evens(nums);
		System.out.println("second = " + Arrays.toString(second) );
		
		
	}
}
