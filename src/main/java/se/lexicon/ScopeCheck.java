package se.lexicon;

public class ScopeCheck {

  public int number1 = 22;
  public static int number2 = 0;


  public void test1() {
    int number1 = 1000;
    System.out.println("Local Variable: " + number1 + " Class Variable or Field: " + this.number1);
  }

  public static void test2() {
    int number2 = 500000;
    System.out.println("Local Variable: " + number2 + " Class Variable or Field: " + ScopeCheck.number2);
  }

  public static void main(String[] args) {
    ScopeCheck scopeCheck = new ScopeCheck();
    scopeCheck.test1(); // 1000


    test2();
  }

}
