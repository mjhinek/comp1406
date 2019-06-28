/* Tutorial #1             */
/* COMP 1006/1406          */

package comp1406a0;

import java.util.Arrays;    // helper functions for arrays
import java.util.Scanner;   // for keyboard input

public class PrintQs{

 
 /* method that generates the exected output  */
 /* it is a helper method for the program     */
 public static String makeOutput(int size){
   String answer = "P";  // this should be changed to Q
  
   //
   // add code here to build up the answer string 
   //
  
   return answer;
 }
 
 /* the main method is the "program"              */
 /* this is what is executed when we run the code */
 public static void main(String[] args){
  
  Scanner keyboard = new Scanner(System.in);
  String input = null;
  int size = 0;

  System.out.print("enter a number (integer) : ");
  if( keyboard.hasNextInt() == true){
    size = keyboard.nextInt();
  }else{
    input = keyboard.next();
    System.out.println("you entered  \"" + input + "\", which is not an integer");
    return;
  }
  System.out.println("you entered the number " + size + " (yea!)");
  
  System.out.println("here is the output...\n");
  
  /* call helper function to generate the expected output */
  System.out.println( makeOutput(size) );
  
  
 }
 
}
