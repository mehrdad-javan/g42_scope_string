package se.lexicon;

public class StringDemo {

  public static void main(String[] args) {
      ex1();
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


}
