package Lecture1;
// public class FormattedOutput {
//   public static void main(String[] args) {
//     int a = 1, b = 2;
//     int c = a + b;
//     String res = a + " + " + b + " = " + c;
//     System.out.println(res);
//   }
// }


// class FormattedOutput1 {

//   public static void main(String[] args) {
//     String s = "qwe";
//     int a = 123;
//     String q = s + a;
//     System.out.println(q);
//   }
// }
class FormattedOutput2 {
  public static void main(String[] args) {
    int a = 1, b = 2;
    int c = a + b;
    String res = String.format("%d + %d = %d \n", a, b, c);
    System.out.printf("%d + %d = %d \n", a, b, c);
    System.out.println(res);
  }
}