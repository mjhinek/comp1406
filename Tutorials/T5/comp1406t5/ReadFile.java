package comp1406t5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

    public static String filename = "input.txt";

    public static void main(String args[]) {
        try {

            BufferedReader   in;

						// open file
            in  = new BufferedReader(new FileReader(filename));

						// read from file
						String line = in.readLine();
						while( line != null ){
							System.out.println(line);
              line = in.readLine();
						}

						// clse file
            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Cannot open file \"" + filename + "\" for reading");
        } catch (IOException e) {
            System.out.println("Error: Cannot read from file \"" + filename + "\"");
        }
    }
}
