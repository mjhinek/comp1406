package comp1406t2;

/** basic tester for Money class */

public class TestMoney{



  public static void main(String[] args){

    int in;
    Money money;
    String actual,expected;

    System.out.print(String.format("%-25s", "Money() test : ");
    money = new Money();
    actual = money.getMoney();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("Money(int, int) test : ");
    money = new Money(0,0);
    actual = money.getMoney();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("Money(int, int) test : ");
    money = new Money(12,7);
    actual = money.getMoney();
    expected = "$12.07";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("Money(int, int) test : ");
    money = new Money(3,4023);
    actual = money.getMoney();
    expected = "$43.23";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("     Money(int) test : ");
    money = new Money(0);
    actual = money.getMoney();
    expected = "$0.00";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    System.out.print("     Money(int) test : ");
    money = new Money(63);
    actual = money.getMoney();
    expected = "$0.63";
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }

    in = 21387;
    money = new Money(in);
    actual = money.getMoney();
    expected = "$213.87";
    System.out.print("Money(" + in + ") test : ");
    System.out.print("expected \"" + expected + "\"   actual output \"" + actual + "\"");
    if( actual.equals(expected) ){
      System.out.println(" pass");
    }else{
      System.out.println(" fail");
    }



  }
}
