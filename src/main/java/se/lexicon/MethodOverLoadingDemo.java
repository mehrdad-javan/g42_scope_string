package se.lexicon;

public class MethodOverLoadingDemo {

  public static void main(String[] args) {
    double n1 = 100.2;
    double n2 = 500.5;
    System.out.println(addition(n1, n2));

    System.out.println(addition(1, 2, 3, 4, 5, 6, 7, 8, 9));
  }

  public static double addition(double num1, double num2) {
    return num1 + num2;
  }

  public static int addition(int num1, int num2) {
    return num1 + num2;
  }


  public static int addition(int... numbers) {
    int result = 0;
    for (int i = 0; i < numbers.length; i++) {
      result = result + numbers[i];
    }

    return result;

  }

}
