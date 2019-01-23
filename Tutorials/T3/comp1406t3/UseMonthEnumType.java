package comp1406t3;

public class UseMonthEnumType{

	public static void main(String[] args){
		// a Month object
		Month current = Month.JANUARY;
		
		// all enum objects have a pre-defined toString() method
		System.out.println("the current month is " + current.toString());
		
		// the values() method returns an array of all constants (objects)
		// in the order that they appear in the enum declaration/definition
		for(Month m : Month.values()){
			System.out.println(m.toString());
		}
	
		// the valueOf(String) method returns the enum object corresponding to the 
		// input string (if it exists)
		current = Month.valueOf("OCTOBER");
		System.out.println("the new current month is " + current.toString());
		
		
		// try uncommenting this code to see what happens when you compile

		//current = Month.valueOf("September");
		//System.out.println("the new current month is " + current.toString());
	
	}
}