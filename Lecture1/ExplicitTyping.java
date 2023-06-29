package Lecture1;

public class ExplicitTyping {
  public static void main(String[] args) {
    int i = 123; double d = i;
    System.out.println(i);
    System.out.println(d);
    d = 3.1415; i = (int)d;
    System.out.println(d);
    System.out.println(i);
    d = 3.9415; i = (int)d;
    System.out.println(d);
    System.out.println(i);
    byte b = Byte.parseByte("123");
    System.out.println(b);
    b = Byte.parseByte("1234");
    System.out.println(b);
  }
}
