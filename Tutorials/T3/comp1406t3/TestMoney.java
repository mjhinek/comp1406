package comp1406t3;

/* basic tester for Money class */

public class TestMoney{
  
  public static void main(String[] args){
    
    Money money;
    String actual,expected;
    
    System.out.print("        Money() test : ");
    money = new Money();
    actual = money.toString();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("Money(int, int) test : ");
    money = new Money(0,0);
    actual = money.toString();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
 
    System.out.print("Money(int, int) test : ");
    money = new Money(12,7);
    actual = money.toString();
    expected = "$12.07";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("Money(int, int) test : ");
    money = new Money(3,4023);
    actual = money.toString();
    expected = "$43.23";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("     Money(int) test : ");
    money = new Money(0);
    actual = money.toString();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("     Money(int) test : ");
    money = new Money(63);
    actual = money.toString();
    expected = "$0.63";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("     Money(int) test : ");
    money = new Money(21387);
    actual = money.toString();
    expected = "$213.87";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    System.out.print("   Money(int[]) test : ");
		int[] some_coinage = {3,0,5,1,3,3}; // $7.53
    money = new Money(some_coinage);
    actual = money.toString();
    expected = "$7.53";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }
    
    
  }
}