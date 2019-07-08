package comp1406a1;

/** Assignment 1 - Summer 2019
  * <p>
  * Problem 1
  * <p>
  * In this provided Peaks.java file, complete the numberOfPeaks method.
  */
public class Peaks{

  	/** Finds the number of "peaks" in the input data array.
	* <p>
	* A value in the input data array is a peak if it is strictly
	* larger than all adjacent (immediate neighbour) values in the
	* data array.
	* <p>
	* Examples:
	*   int[] data1 = {1,3,2,1,0,0};
	*   numberOfPeaks(data1) ==> 1 (3 is the only peak)
	*   int[] data2 = {4,3,6};
	*   numberOfPeaks(data2) ==> 2 (4 and 6 are peaks)
	*   int[] data3 = {2,2};
	*   numberOfPeaks(data3) ==> 0 (there are no peaks)
	*
  	*
    	* @param data is an array of one or more integers.
    	*
    	* @return the number of "peaks" in the input data array.
    	*/
 	public static int numberOfPeaks(int[] data){
		int peaks = -3;
		
		return peaks;
  	}

	
	/** basic testing... you should be doing much more testing on your own! */
	public static void main(String[] args){
		// basic testing
		int[] data1 = new int[]{25};
		int   expected1 = 1;
		display(1, data1, expected1);

		int[] data2 = new int[]{1,3,2,3,-10,4};
		int   expected2 = 3;
		display(2, data2, expected2);
	}

	/** helper method to print test case */
	public static void display(int number, int[] data, int expected){
		System.out.print( "example " + number + ": ");
		System.out.print( "expected = " + expected);
		int actual = numberOfPeaks(data);
		System.out.print( ", actual is " + actual);
		if( actual == expected){
			System.out.println("  [pass]");
		}else{
			System.out.println("  [fail]");
		}
	}

	
}
