package comp1406t4;

import java.util.HashSet;
import java.util.ArrayList;

public class SetORList{

	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		
		int size = 100;
		if(args.length == 1){
			try{
				size = Integer.parseInt(args[0]);
				System.out.println("using size = " + size);				
			}catch(Exception e){
			  System.out.println("command line argument was not an integer!");
				System.out.println("using the default value for size = " + size);
			}
		}
		
		
		System.out.print("making collections... ");
		for(int i=0; i<size; i+=1){
			list.add(i);
			set.add(i);
		}
		System.out.println("done!");
		
		// measure time for many calls to contains for set
		long start_time = System.nanoTime();
		System.out.print("set time  = ");
		for(int i=0; i<2*size; i+=1){
			set.contains(i);
		}		
		long set_time = System.nanoTime()-start_time;
		System.out.println(set_time*1e-9);

		// measure time for many calls to contains for arraylist
		start_time = System.nanoTime();
		System.out.print("list time = ");
		
		for(int i=0; i<2*size; i+=1){
			list.contains(i);
		}		
		long list_time = System.nanoTime()-start_time;
		
		System.out.println(list_time*1e-9);
		
	
	}
	

}