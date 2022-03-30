package se.lexicon;

public class StringDemo {

  public static void main(String[] args) {
      ex2();
  }


  // charAt() and length() methods
  public static void ex1 (){
    String name = "Erik Svensson";
    System.out.println(name);
    System.out.println(name.length());

    System.out.println(name.charAt(2));
    System.out.println("-----------------------");
    for (int i = 0 ; i < name.length(); i++){
      System.out.println(name.charAt(i));
    }
  }

  public static void ex2(){
    String name1 = "ulf";
    String name2 = "ULF";
    System.out.println(name1.equals(name2)); // false
    System.out.println(name1.equalsIgnoreCase(name2)); // true
  }


}
