package Lecture1;
public class ImplicitТyping {
  public static void main(String[] args) {
    var a = 123;
    var d = 123.456;
    System.out.println(a);
    System.out.println(getType(a));
    System.out.println(d);
    System.out.println(getType(d));
    d = 1022;
    System.out.println(d); // 1022
    //d = "mistake";
    //error: incompatible types:
    //String cannot be converted to double
  }
  static String getType(Object o){
    return o.getClass().getSimpleName();
  }
}