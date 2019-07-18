public class UseExample{

	public static void main(String[] args){
		Example one = Example.ONE;
		Example two = Example.TWO;
		Example three = Example.THREE;
		Example otherOne = Example.ONE;
		
		System.out.println( "one is " + one );
		System.out.println( "two is " + two );
		System.out.println( "one==two is " + (one==two));
		System.out.println( "one==otherOne is " + (one==otherOne));
		
		
		// can iterate over all the enums
		
		for(Example e : Example.values() ){
			System.out.println( e );
		}
	
	  // check against a string?
		
		System.out.println( "one.name() -> \"" + one.name() + "\"");
		System.out.println( one.name().equals("ONE") );
		
	}
}