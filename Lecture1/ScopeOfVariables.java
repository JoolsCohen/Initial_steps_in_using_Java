package Lecture1;

public class ScopeOfVariables {
  public static void main(String[] args) {
    int b = 111;
    {
      int a = 222;
      System.out.println(a + b);
    }
    int a = 123;
    System.out.println(a);
  }
}
