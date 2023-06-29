package Lecture1;
// Присваивание: =
// Арифметические: *, /, +, -, %, ++, --
// Операции сравнения: <, >, ==, !=, >=, <=
// Логические операции: ||, &&, ^, !
// Побитовые операции <<, >>, &, |, ^

// public class JavaOperations {
//   public static void main(String[] args) {
//     int a = 123;
//     System.out.println(a++);    //123 префиксный инкримент
//     System.out.println(a);      //124
//     System.out.println(++a);    //125 постфиксный инкримент
//     System.out.println(a);      //125
//   }
// }

// class JavaOperations1 {
//   public static void main(String[] args) {
//     int i = 18;
//     //10010
//     //i = i << 1;
//     System.out.println(i >> 1);
//   }
// }

// class JavaOperations2 {
//   public static void main(String[] args) {
//     int a = 5;
//     int b = 2;
//     System.out.println(a & b);
//     System.out.println(a | b);
//     System.out.println(a ^ b);
//   }
// }

class JavaOperations3 {
  public static void main(String[] args) {
    String s = "qwewm"; // 4, 0...3 
    // boolean b = s.length() >= 5 && s.charAt(4) == '1';
    // boolean b = s.length() >= 5 & s.charAt(4) == '1';
    boolean b = s.length() >= 5 || s.charAt(4) == '1';
    //boolean b = s.length() >= 5 | s.charAt(4) == '1';
    System.out.println(b);
    // System.out.println(a & b);
    // System.out.println(a && b);
    //System.out.println(a | b);
    //System.out.println(a ^ b);
  }
}