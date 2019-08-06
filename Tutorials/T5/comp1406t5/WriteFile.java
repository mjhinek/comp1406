package comp1406t5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;


public class WriteFile {

    public static String filename = "output.txt";

    public static void main(String[] args) {
         try {
             PrintWriter  out;

             // open file for writing
             // (deleting current contents if the file already exists)
             out = new PrintWriter(new FileWriter(filename));

             // write to the file
             for(int i=0; i<10; i+=1){
               for(int j=0; j<20; j+=1){
                 if( Math.random() < 0.5 ){
                   out.print("/");
                 }else{
                   out.print("\\");
                 }
               }
               out.println();
             }

             // close the file
             out.close();

         } catch (FileNotFoundException e) {
             System.out.println("Error: Cannot open file \"" + filename + "\" for writing.");
         } catch (IOException e) {
             System.out.println("Error: Cannot write to file \"" + filename + "\".");
         }
     }


}
