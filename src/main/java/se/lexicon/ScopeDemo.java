package se.lexicon;

public class ScopeDemo {

  public static void main(String[] args) {
    int result = 0;

    for (int i = 0 ; i< 5; i++){
      result = result + i;
      System.out.println(result);
      //int result = 10000; //Local Variables need to have a unique name

    }


    //System.out.println(i);

  }

  public void test(){
    int result = 5000;
    System.out.println(result);
  }


}
