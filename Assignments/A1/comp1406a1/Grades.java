package comp1406a1;

/** Assignment 1 - Summer 2019
  * <p>
  * Problem 3
  * <p> In the provided Grades.java files, complete the finalLetterGrade method.
  * <p>
  * You must use the grading scheme as specified in the course outline.
  * Be careful to read and understand the condition for passing the course.
  */


public class Grades{

    /* ----------  DO NOT CHANGE the VALUE of EPSILON ----------------
       two numbers x,y will be considered the same if
       Math.abs(x-y) <= epsilon
    ------------------------------------------------------------------ */
    static double EPSILON = 0.000001;



    /** Computes the final letter grade based on a student's term network
     *  (assignments, tutorials, quizzes, midterm and final exam)
     *  based on the course outline, Carleton's grade conversion table
		 *  and a special condition when a student misses the midterm but has
     *  as valid doctor's note.		 
     * <p>
     *  When a student misses the midterm but has a valid doctor's note, 
		 *  the weight of their midterm will be shifted to the final exam. 
		 *  So, their midterm will count towards 0% of their final grade and
     *  and their final exam will count towards 60% (instead of 30%).  
		 *  This situation will be identified when the submitted midterm grade 
		 *  is less than or equal to -1. 
		 * <p>
     * @param assignments is the student's overall assignment grade (out of 100)
     * @param tutorials is the student's overall tutorial grade (out of 100)
     * @param quizzes is the student's overall quiz grade (out of 100). 
		 * @param midterm is the student's midterm grade (out of 100)
		 *        The midterm grade may also be a number less than or equal 
		 *        to -1 (when the student misses the midterm with a valid 
		 *        doctor's note. 
     * @param final_exam is the student's final exam grade (out of 100)
     * @return the letter grade based on course outline and Carleton's standard
     *         grade conversion table. If a student misses the midterm with a
     *         valid doctor's note then the weight of the midterm is shifted to the
     *         final exam (that is, the midterm will be worth 0% and the final
     *         exam will be worth 60%).
     */
  public static String finalLetterGrade(double assignments,
                                        double tutorials,
                                        double quizzes,
                                        double midterm,
                                        double final_exam)
  {
    // add your own code here and return the correct letter grade
    return "???";
  }

}
