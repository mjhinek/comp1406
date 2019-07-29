package comp1406t4;

import java.util.Random;
import java.util.Arrays;

public class RandomNumbers{

  public static int[] randomNumbers(int size, int range){
		return new int[]{ (int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100) };
	}
	
	
	public static void main(String[] args){
			Random rnd = new Random();
			int size = 10;
			int range = 100;
			int[] numbers = randomNumbers(size, range);
			Arrays.sort(numbers);
			System.out.println( Arrays.toString(numbers) );
	}

}