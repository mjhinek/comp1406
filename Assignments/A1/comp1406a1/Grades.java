package comp1406a1;

/** Assignment 1 - Winter 2019
  * <p>
  * Problem 3
  * <p> In the provided Grades.java files, complete the finalExamGradeNeeded method.
  * <p>
  * This method takes several input parameters: a target letter grade (String), 
  * a list of assignment grades (double[]), a list of tutorial grades (double[]) 
  * and a list of midterm grades (double[]). 
  * <p>
  * The method returns the minimum grade needed on the final exam to achieve the 
  * target letter grade based on the other input grades. 
  * <p>
  * You must use the grading scheme as specified in the course outline. 
  * Be careful to read and understand the condition for passing the course. 
  * If the needed final exam grade is more than 100.0, then the method should return -1.0. 
  * If the target grade will be achieved (or surpassed) regardless of the final exam mark, 
  * the method should return 0.0.
  */


public class Grades{
  
  /** Computes the minimum final exam grade needed to achieve a desired 
    * target letter grade based on provided assignment, tutorial and midterm 
    * grades.
    * <p>
    * The Grade determination is based on that given in the course outline.
    * (See Piazza and be sure to read the course outline!)
    * 
    * @param target is the desired letter grade.
    * @param assignments contains all nine assignment grades (each out of 100). The first six are the main assignments and the last three are the study assignments.
    * @param tutorials contains all 10 tutorial grades (each out of 100). 
    * @param midterms contains all 3 midterm grades (each out of 100).
    * 
    * @return the minimum grade needed to achieve the target letter grade based on 
    *         the provided assignment/tutorial/midterm grades and the description 
    *         provided in the course outline. If the needed final exam grade is more 
    *         than 100.0, return -1.0. If the target grade will be achieved (or surpassed) 
    *         regardless of the final exam mark, returns 0.0.
    */
  public static double finalExamGradeNeeded(String   target,
                                            double[] assignments,
                                            double[] tutorials,
                                            double[] midterms){
    
    return -123.456;
  }
  
}